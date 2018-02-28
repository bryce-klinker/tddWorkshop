import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class IntegerToRomanConverterTest {

  @Test
  public void convertsSixteenToXVI() throws Exception {
    IntegerToRomanConverter converter = new IntegerToRomanConverter();

    assertEquals("XVI", converter.convertToRoman(16));
  }

}
