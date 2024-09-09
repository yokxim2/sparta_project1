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
    private List<Double> calculationResult = new ArrayList<>();

    public double calculate(String firstNum, String secondNum, String operator) throws BadInputException {
        double num1 = parser.parseNumber(firstNum);
        double num2 = parser.parseNumber(secondNum);
        operation = parser.parseOperator(operator);

        double result = operation.operate(num1, num2);
        saveResult(result);

        return result;
    }

    // ===============
    // calculationResult 조작 메서드들
    public void saveResult(double result) {
        calculationResult.add(result);
    }

    public double getResult(int index) {
        return calculationResult.get(index);
    }

    public void setResult(int index, double newValue) {
        calculationResult.set(index, newValue);
    }

    public String showResult() {
        return calculationResult.toString();
    }

    public void removeLatestResult() {
        calculationResult.removeFirst();
        System.out.println("첫번째 기록이 성공적으로 제거되었습니다.");
        System.out.println("지금까지의 기록: " + calculationResult.toString());
    }
}
