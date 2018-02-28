import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorTest {

  @Test
  public void onePlusOneIsTwo() {
    RomanNumeralCalculator calculator = new RomanNumeralCalculator();

    String actualResult = calculator.add("I", "I");
    assertEquals("II", actualResult);
  }

  @Test
  public void onePlusTwoIsThree() {
    RomanNumeralCalculator calculator = new RomanNumeralCalculator();

    String actualResult = calculator.add("I", "II");
    assertEquals("III", actualResult);
  }
}
