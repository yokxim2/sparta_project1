package level3.operation;

import level3.error.DivisionByZeroException;

// 실제 연산을 수행하는 연산(Operation) 객체
public abstract class AbstractOperation {
    public abstract double operate(double num1, double num2) throws DivisionByZeroException;
}
