import java.util.ArrayList;
import java.util.List;

public class FakeSubscriberService implements SubscriberService {

  public List<String> subscribers = new ArrayList<>();
  public int day;
  public int month;
  public int year;

  @Override
  public List<String> getSubscribersThatWillExpireBetweenNowAndDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
    return subscribers;
  }
}
