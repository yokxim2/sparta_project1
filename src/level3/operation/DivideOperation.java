package level3.operation;

import level3.error.DivisionByZeroException;

public class DivideOperation extends AbstractOperation {

    @Override
    public double operate(double num1, double num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException();
        }
        return num1 / num2;
    }
}
