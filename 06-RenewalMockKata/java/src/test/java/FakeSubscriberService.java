import java.util.ArrayList;
import java.util.List;

public class FakeSubscriberService implements SubscriberService {

  public List<String> subscribers = new ArrayList<>();

  @Override
  public List<String> getSubscribersThatWillExpireBetweenNowAndDate(int day, int month, int year) {
    return subscribers;
  }
}
