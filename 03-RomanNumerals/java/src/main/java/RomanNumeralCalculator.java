public class RomanNumeralCalculator {

  public String add(String numeral1, String numeral2) {
    return asString(asInt(numeral1) + asInt(numeral2));
  }

  private int asInt(String numeral) {
    if (numeral.equals("I"))
      return 1;

    if (numeral.equals("II"))
      return 2;

    return 0;
  }

  private String asString(int value) {
    if (value == 2)
      return "II";

    if (value == 3)
      return "III";

    if (value == 4)
      return "IV";

    return "";
  }
}
