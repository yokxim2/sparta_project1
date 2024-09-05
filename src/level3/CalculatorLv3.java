package level3;

import level3.operation.AbstractOperation;

import java.util.ArrayList;
import java.util.List;

public class CalculatorLv3 {

    private AbstractOperation operation;
    // 연산 결과 저장
    private List<Double> history = new ArrayList<>();

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNum, int secondNum) {
        double result = operation.operate(firstNum, secondNum);
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
}
