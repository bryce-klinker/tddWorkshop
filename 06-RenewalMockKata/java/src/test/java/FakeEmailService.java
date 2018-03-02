import java.util.List;

public class FakeEmailService implements EmailService {
  public String message;
  public List<String> emails;

  @Override
  public void emailMessage(String message, List<String> emails) {
    this.message = message;
    this.emails = emails;
  }
}
