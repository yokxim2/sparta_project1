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
    private Parser parser = new Parser();

    // 연산 결과 저장
    private List<Double> history = new ArrayList<>();

    public double calculate(String firstNum, String secondNum, String operator) throws BadInputException {
        double num1 = parser.parseNumber(firstNum);
        double num2 = parser.parseNumber(secondNum);
        operation = parser.parseOperator(operator);

        double result = operation.operate(num1, num2);
        saveHistory(result);

        return result;
    }

    // ===============
    // History 조작 메서드들
    public void saveHistory(double result) {
        history.add(result);
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
}
