package level3;

import level3.error.BadInputException;
import level3.error.DivisionByZeroException;
import level3.error.WrongNumberInputException;
import level3.error.WrongOperatorInputException;
import level3.operation.*;

import java.util.ArrayList;
import java.util.List;

public class CalculatorLv3 {

    private AbstractOperation operation;
    // 연산 결과 저장
    private List<Double> history = new ArrayList<>();

    public void setOperator(String op) throws WrongOperatorInputException {
        if (Parser.isOperator(op)) {
            switch (op) {
                case "+":
                    this.operation = new AddOperation();
                    break;
                case "-":
                    this.operation = new SubtractOperation();
                    break;
                case "*":
                    this.operation = new MultiplyOperation();
                    break;
                case "/":
                    this.operation = new DivideOperation();
                    break;
                default:
                    throw new WrongOperatorInputException();
            }
        }
    }

    public double calculate(String firstNum, String secondNum, String operator) throws BadInputException {
        if (!Parser.isNumber(firstNum) || !Parser.isNumber(secondNum)) {
            throw new WrongNumberInputException();
        }

        Parser.checkDivisionByZero(secondNum, operator);

        Double result = operation.operate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
        history.add(result);

        return result;
    }

    public double getHistory(int index) {
        return history.get(index);
    }

    public void setHistory(int index, double newValue) {
        history.set(index, newValue);
    }

    public String showHistory() {
        return history.toString();
    }

    public void removeLatestHistory() {
        history.removeFirst();
        System.out.println("첫번째 기록이 성공적으로 제거되었습니다.");
        System.out.println("지금까지의 기록: " + history.toString());
    }

    public static class Parser {
        public static boolean isNumber(String input) throws WrongNumberInputException {
            try {
                parseNumber(input);
                return true;
            } catch (WrongNumberInputException e) {
                throw e;
            }
        }

        public static boolean isOperator(String op) throws WrongOperatorInputException {
            if (OperatorType.contains(op)) {
                return true;
            } else {
                throw new WrongOperatorInputException();
            }
        }

        public static void checkDivisionByZero(String num, String op) throws DivisionByZeroException {
            if (op.equals("/") && Double.parseDouble(num) == 0) {
                throw new DivisionByZeroException();
            }
        }

        public static <T extends Number> T parseNumber(String input) throws WrongNumberInputException {
            try {
                return (T) Integer.valueOf(input);
            } catch (NumberFormatException e1) {
                try {
                    return (T) Long.valueOf(input);
                } catch (NumberFormatException e2) {
                    try {
                        return (T) Double.valueOf(input);
                    } catch (NumberFormatException e3) {
                        throw new WrongNumberInputException();
                    }
                }
            }
        }
    }
}
