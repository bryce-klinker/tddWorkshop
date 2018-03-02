import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class RenewalNotificationServiceTest {

  private FakeEmailService _emailService;
  private FakeSubscriberService _subscriberService;
  private FakeClock _clock;
  private RenewalNotificationService _renewalNotificationService;

  @Before
  public void setUp() {
    _clock = new FakeClock();
    _emailService = new FakeEmailService();
    _subscriberService = new FakeSubscriberService();
    _renewalNotificationService = new RenewalNotificationService(_subscriberService, _emailService, _clock);
  }

  @Test
  public void notifyingSubscribersShouldSendRenewalMessage() {
    _renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals("Please renew your subscription to Ferret Fancy!", _emailService.message);
  }

  @Test
  public void notifyingSubscribersShouldSendEmailsToExpiredSubscribers() {
    _subscriberService.subscribers.add("three");

    _renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals("three", _emailService.emails.get(0));
  }

  @Test
  public void notifyingSubscribersShouldGetSubscribersForNextThreeMonths() {
    _clock.currentDate = LocalDate.of(2018, 2, 4);
    _renewalNotificationService.notifyAtRiskSubscribers();

    assertEquals(4, _subscriberService.day);
    assertEquals(5, _subscriberService.month);
    assertEquals(2018, _subscriberService.year);
  }
}

