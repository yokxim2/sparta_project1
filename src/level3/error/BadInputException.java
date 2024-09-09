package level3.error;

// 부모 예외 객체 BadInputException
// 예외 계층 구조를 사용해서 여러 종류의 예외를 한꺼번에 처리할 수 있고, 자식 예외 클래스를 개별적으로도 처리할 수 있어 유연하게 예외 처리 로직을 작성할 수 있었음
public class BadInputException extends Exception {
    public BadInputException(String message) {
        super(message);
    }
}
