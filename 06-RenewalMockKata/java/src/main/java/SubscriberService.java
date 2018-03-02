import java.util.List;

public interface SubscriberService {
	
	List<String> getSubscribersThatWillExpireBetweenNowAndDate(int day, int month, int year);

}
