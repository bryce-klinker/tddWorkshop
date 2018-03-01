public class RomanNumeralCalculator {
  private final RomanNumeralToIntegerConverter _toIntConverter;
  private final IntegerToRomanNumeralConverter _toRomanConverter;

  RomanNumeralCalculator() {
    _toIntConverter = new RomanNumeralToIntegerConverter();
    _toRomanConverter = new IntegerToRomanNumeralConverter();
  }

  public String add(String numeral1, String numeral2) {
    int first = _toIntConverter.toInt(numeral1);
    int second = _toIntConverter.toInt(numeral2);
    return _toRomanConverter.toRoman(first + second);
  }
}

