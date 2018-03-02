import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RenewalNotificationServiceTest {

  @Test
  public void notifyingSubscribersShouldSendRenewalMessage() {
    FakeEmailService emailService = new FakeEmailService();

    RenewalNotificationService renewalNotificationService = new RenewalNotificationService(new FakeSubscriberService(), emailService);
    renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals("Please renew your subscription to Ferret Fancy!", emailService.message);
  }

  @Test
  public void notifyingSubscribersShouldSendEmailsToExpiredSubscribers() {
    FakeSubscriberService subscriberService = new FakeSubscriberService();
    subscriberService.subscribers.add("three");

    FakeEmailService emailService = new FakeEmailService();

    RenewalNotificationService renewalNotificationService = new RenewalNotificationService(subscriberService, emailService);
    renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals("three", emailService.emails.get(0));
  }
}

