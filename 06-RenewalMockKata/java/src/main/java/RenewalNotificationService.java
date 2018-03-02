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
    LocalDate threeMonthsFromNow = _clock.getCurrentDate().plusMonths(3);
    int month = threeMonthsFromNow.getMonth().getValue();
    int day = threeMonthsFromNow.getDayOfMonth();
    int year = threeMonthsFromNow.getYear();
    List<String> subscribers = _subscriberService.getSubscribersThatWillExpireBetweenNowAndDate(day, month, year);
    trySendEmails(subscribers);
  }

  private void trySendEmails(List<String> subscribers) {
    try {
      sendEmails(subscribers);
    } catch (Exception ex) {
      sendEmails(subscribers);
    }
  }

  private void sendEmails(List<String> subscribers) {
    _emailService.emailMessage("Please renew your subscription to Ferret Fancy!", subscribers);
  }
}
