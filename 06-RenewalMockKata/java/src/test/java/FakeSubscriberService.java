import java.util.ArrayList;
import java.util.List;

public class FakeSubscriberService implements SubscriberService {

  public List<String> subscribers = new ArrayList<>();
  public int day;
  public int month;
  public int year;

  public int exceptionCount;
  public RuntimeException exception;

  @Override
  public List<String> getSubscribersThatWillExpireBetweenNowAndDate(int day, int month, int year) {
    if (exception != null) {
      exceptionCount -= 1;
      RuntimeException exceptionToThrow = exception;
      if (exceptionCount <= 0) {
        exception = null;
      }
      throw exceptionToThrow;
    }

    this.day = day;
    this.month = month;
    this.year = year;
    return subscribers;
  }
}
