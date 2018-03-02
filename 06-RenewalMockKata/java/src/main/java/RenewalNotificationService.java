import java.time.LocalDate;
import java.util.List;

public class RenewalNotificationService {
  private final SubscriberService _subscriberService;
  private final EmailService _emailService;
  private Clock _clock;

  public RenewalNotificationService(SubscriberService subscriberService, EmailService emailService, Clock clock) {
    _subscriberService = subscriberService;
    _emailService = emailService;
    _clock = clock;
  }

  public void notifyAtRiskSubscribers() {
    List<String> subscribers = tryGetSubscribers();
    trySendEmails(subscribers);
  }

  private List<String> tryGetSubscribers() {
    LocalDate threeMonthsFromNow = _clock.getCurrentDate().plusMonths(3);
    int month = threeMonthsFromNow.getMonth().getValue();
    int day = threeMonthsFromNow.getDayOfMonth();
    int year = threeMonthsFromNow.getYear();
    List<String> subscribers = null;
    boolean wasSuccessful = false;
    while (!wasSuccessful) {
      try {
        subscribers = getSubscribers(month, day, year);
        wasSuccessful = true;
      } catch (Exception ex) {
      }
    }
    return subscribers;
  }

  private List<String> getSubscribers(int month, int day, int year) {
    return _subscriberService.getSubscribersThatWillExpireBetweenNowAndDate(day, month, year);
  }

  private void trySendEmails(List<String> subscribers) {
    boolean wasSuccessful = false;
    while (!wasSuccessful) {
      try {
        sendEmails(subscribers);
        wasSuccessful = true;
      } catch (Exception ex) {
      }
    }

  }

  private void sendEmails(List<String> subscribers) {
    _emailService.emailMessage("Please renew your subscription to Ferret Fancy!", subscribers);
  }
}
