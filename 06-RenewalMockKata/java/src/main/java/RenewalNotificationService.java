import java.util.List;

public class RenewalNotificationService {
  private final SubscriberService _subscriberService;
  private final EmailService _emailService;

  public RenewalNotificationService(SubscriberService subscriberService, EmailService emailService) {
    _subscriberService = subscriberService;
    _emailService = emailService;
  }

  public void notifyAtRiskSubscribers() {
    List<String> subscribers = _subscriberService.getSubscribersThatWillExpireBetweenNowAndDate(0, 0, 0);
    _emailService.emailMessage("Please renew your subscription to Ferret Fancy!", subscribers);
  }
}
