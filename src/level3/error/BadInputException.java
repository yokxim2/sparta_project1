package level3.error;

// 계산하는 메서드 calculate()에서 발생할 수 있는 모든 예외 상황을 한번에 잡을 수 있도록 부모 예외 객체 BadInputException을 사용했음
public class BadInputException extends Exception {
    public BadInputException(String message) {
        super(message);
    }
}
