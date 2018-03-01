import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanNumeralConverterTest {
  private IntegerToRomanNumeralConverter _converter;

  @Before
  public void setUp() {
    _converter = new IntegerToRomanNumeralConverter();
  }

  @Test
  public void oneIsI() {
    assertEquals("I", _converter.toRoman(1));
  }

  @Test
  public void twoIsII() {
    assertEquals("II", _converter.toRoman(2));
  }

  @Test
  public void threeIsIII() {
    assertEquals("III", _converter.toRoman(3));
  }

  @Test
  public void fourIsIV() {
    assertEquals("IV", _converter.toRoman(4));
  }

  @Test
  public void fiveIsV() {
    assertEquals("V", _converter.toRoman(5));
  }

  @Test
  public void nineIsIX() {
    assertEquals("IX", _converter.toRoman(9));
  }

  @Test
  public void tenIsX() {
    assertEquals("X", _converter.toRoman(10));
  }

  @Test
  public void fourteenIsXIV() {
    assertEquals("XIV", _converter.toRoman(14));
  }

  @Test
  public void fifteenIsXV() {
    assertEquals("XV", _converter.toRoman(15));
  }

  @Test
  public void fortyIsXL() {
    assertEquals("XL", _converter.toRoman(40));
  }

  @Test
  public void fiftyIsL() {
    assertEquals("L", _converter.toRoman(50));
  }

  @Test
  public void ninetyIsXC() {
    assertEquals("XC", _converter.toRoman(90));
  }

  @Test
  public void oneHundredIsC() {
    assertEquals("C", _converter.toRoman(100));
  }

  @Test
  public void fourHundredIsCD() {
    assertEquals("CD", _converter.toRoman(400));
  }

  @Test
  public void fiveHundredIsC() {
    assertEquals("D", _converter.toRoman(500));
  }

  @Test
  public void nineHundredIsCM() {
    assertEquals("CM", _converter.toRoman(900));
  }

  @Test
  public void oneThousandIsM() {
    assertEquals("M", _converter.toRoman(1000));
  }
}
