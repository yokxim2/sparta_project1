package level3.error;

public class DivisionByZeroException extends BadInputException {
    public DivisionByZeroException() {
        super("0으로 나누기 시도는 불가능합니다.");
    }
}
