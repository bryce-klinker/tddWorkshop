import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralCalculatorTest {
  private RomanNumeralCalculator _calculator;

  @Before
  public void setUp() {
    _calculator = new RomanNumeralCalculator();
  }

  @Test
  public void onePlusOneIsTwo() {
    String actual = _calculator.add("I", "I");
    assertEquals("II", actual);
  }

  @Test
  public void onePlusTwoIsThree() {
    String actual = _calculator.add("I", "II");
    assertEquals("III", actual);
  }

  @Test
  public void twoPlusTwoIsFour() {
    String actual = _calculator.add("II", "II");
    assertEquals("IV", actual);
  }

  @Test
  public void threePlusTwoIsFive() {
    String actual = _calculator.add("III", "II");
    assertEquals("V", actual);
  }

  @Test
  public void fivePlusFourIsNine() {
    String actual = _calculator.add("V", "IV");
    assertEquals("IX", actual);
  }
}
