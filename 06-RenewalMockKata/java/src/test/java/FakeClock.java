import java.time.LocalDate;

public class FakeClock implements Clock {
  public LocalDate currentDate = LocalDate.now();

  @Override
  public LocalDate getCurrentDate() {
    return currentDate;
  }
}
