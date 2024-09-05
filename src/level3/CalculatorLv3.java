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
        OperatorType type = Parser.parseOperator(op);
        switch (type) {
            case OperatorType.ADDITION:
                this.operation = new AddOperation();
                break;
            case OperatorType.SUBTRACTION:
                this.operation = new SubtractOperation();
                break;
            case OperatorType.MULTIPLICATION:
                this.operation = new MultiplyOperation();
                break;
            case OperatorType.DIVISION:
                this.operation = new DivideOperation();
                break;
        }
    }

    public double calculate(String firstNum, String secondNum, String operator) throws BadInputException {
        if (!Parser.isNumber(firstNum) || !Parser.isNumber(secondNum)) {
            throw new WrongNumberInputException();
        }

        setOperator(operator);

        Parser.checkDivisionByZero(secondNum, operator);

        Double result = operation.operate(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
        history.add(result);

        return result;
    }

    // 사용자 입력값이 올바른 입력값인지 확인하는 검사(Parser) 객체
    public static class Parser {
        public static boolean isNumber(String input) throws WrongNumberInputException {
            try {
                parseNumber(input);
                return true;
            } catch (WrongNumberInputException e) {
                throw e;
            }
        }

        // 숫자를 String 타입으로 입력 받아 모든 숫자 타입(Integer, Double, Long)에 대처할 수 있도록 설계
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

        public static OperatorType parseOperator(String op) throws WrongOperatorInputException {
            if (OperatorType.contains(op)) {
                return OperatorType.valueOf(op);
            } else {
                throw new WrongOperatorInputException();
            }
        }

        public static void checkDivisionByZero(String num, String op) throws DivisionByZeroException {
            if (op.equals("/") && Double.parseDouble(num) == 0) {
                throw new DivisionByZeroException();
            }
        }
    }

    // ===============
    // History 조작 메서드들
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
}
