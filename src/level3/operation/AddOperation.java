package level3.operation;

public class AddOperation extends AbstractOperation {
    @Override
    public double operate(int num1, int num2) {
        return (double) num1 + num2;
    }
}
