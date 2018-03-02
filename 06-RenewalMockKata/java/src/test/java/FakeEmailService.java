import java.util.List;

public class FakeEmailService implements EmailService {
  public String message;
  public List<String> emails;

  public RuntimeException exception;

  @Override
  public void emailMessage(String message, List<String> emails) {
    if (exception != null) {
      RuntimeException exceptionToThrow = exception;
      exception = null;
      throw exceptionToThrow;
    }

    this.message = message;
    this.emails = emails;
  }
}
