package level2.error;

public class DivisionByZeroException extends RuntimeException {
  public DivisionByZeroException(String message) {
    super(message);
  }
}
