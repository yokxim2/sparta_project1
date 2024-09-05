package level3.error;

public class WrongNumberInputException extends BadInputException {
    public WrongNumberInputException() {
        super("올바르지 않은 숫자 형식입니다.");
    }
}
