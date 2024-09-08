package level3.operation;

import level3.error.DivisionByZeroException;

public abstract class AbstractOperation {
    public abstract double operate(double num1, double num2) throws DivisionByZeroException;
}
