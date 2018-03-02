import java.util.ArrayList;
import java.util.List;

public class FakeSubscriberService implements SubscriberService {

  public List<String> subscribers = new ArrayList<>();
  public int day;
  public int month;
  public int year;

  public RuntimeException exception;

  @Override
  public List<String> getSubscribersThatWillExpireBetweenNowAndDate(int day, int month, int year) {
    if (exception != null) {
      RuntimeException exceptionToThrow = exception;
      exception = null;
      throw exception;
    }

    this.day = day;
    this.month = month;
    this.year = year;
    return subscribers;
  }
}
