import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RenewalNotificationServiceTest {

  private FakeEmailService _emailService;
  private FakeSubscriberService _subscriberService;

  @Before
  public void setUp() {
    _emailService = new FakeEmailService();
    _subscriberService = new FakeSubscriberService();
  }

  @Test
  public void notifyingSubscribersShouldSendRenewalMessage() {
    RenewalNotificationService renewalNotificationService = new RenewalNotificationService(_subscriberService, _emailService);
    renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals("Please renew your subscription to Ferret Fancy!", _emailService.message);
  }

  @Test
  public void notifyingSubscribersShouldSendEmailsToExpiredSubscribers() {
    _subscriberService.subscribers.add("three");

    RenewalNotificationService renewalNotificationService = new RenewalNotificationService(_subscriberService, _emailService);
    renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals("three", _emailService.emails.get(0));
  }
}

