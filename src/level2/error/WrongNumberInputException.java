package level2.error;

public class WrongNumberInputException extends RuntimeException {
  public WrongNumberInputException(String message) {
    super(message);
  }
}
