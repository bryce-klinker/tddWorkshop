import java.util.List;

public class FakeEmailService implements EmailService {
  public String message;
  public List<String> emails;

  public RuntimeException exception;
  public int exceptionCount;

  @Override
  public void emailMessage(String message, List<String> emails) {
    if (exception != null) {
      exceptionCount -= 1;
      RuntimeException exceptionToThrow = exception;
      if (exceptionCount <= 0) {
        exception = null;
      }
      throw exceptionToThrow;
    }

    this.message = message;
    this.emails = emails;
  }
}
