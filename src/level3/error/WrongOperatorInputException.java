package level3.error;

public class WrongOperatorInputException extends BadInputException {
    public WrongOperatorInputException() {
        super("올바르지 않은 연산자 형식입니다.");
    }
}
