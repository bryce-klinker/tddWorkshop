import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralToIntegerConverterTest {
  private RomanNumeralToIntegerConverter _converter;

  @Before
  public void setUp() {
    _converter = new RomanNumeralToIntegerConverter();
  }

  @Test
  public void romanIIsOne() {
    assertEquals(1, _converter.toInt("I"));
  }

  @Test
  public void romanIIIsTwo() {
    assertEquals(2, _converter.toInt("II"));
  }

  @Test
  public void romanIIIIsOne() {
    assertEquals(3, _converter.toInt("III"));
  }

  @Test
  public void romanIVIsFour() {
    assertEquals(4, _converter.toInt("IV"));
  }

  @Test
  public void romanVIsFive() {
    assertEquals(5, _converter.toInt("V"));
  }

  @Test
  public void romanIXIsNine() {
    assertEquals(9, _converter.toInt("IX"));
  }

  @Test
  public void romanXIsTen() {
    assertEquals(10, _converter.toInt("X"));
  }

  @Test
  public void romanXLIsForty() {
    assertEquals(40, _converter.toInt("XL"));
  }

  @Test
  public void romanLIsFifty() {
    assertEquals(50, _converter.toInt("L"));
  }

  @Test
  public void romanXCIsNinety() {
    assertEquals(90, _converter.toInt("XC"));
  }

  @Test
  public void romanCIsOneHundred() {
    assertEquals(100, _converter.toInt("C"));
  }

  @Test
  public void romanCDIsFourHundred() {
    assertEquals(400, _converter.toInt("CD"));
  }

  @Test
  public void romanDIsFiveHundred() {
    assertEquals(500, _converter.toInt("D"));
  }

  @Test
  public void romanCMIsNineHundred() {
    assertEquals(900, _converter.toInt("CM"));
  }

  @Test
  public void romanMIsOneThousand() {
    assertEquals(1000, _converter.toInt("M"));
  }
}
