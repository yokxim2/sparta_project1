package level2.error;

public class BadInputException extends RuntimeException {
  public BadInputException(String message) {
    super(message);
  }
}
