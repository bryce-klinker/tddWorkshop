import java.util.HashMap;

public class RomanNumeralToIntegerConverter {
  private static HashMap<String, Integer> _map;

  static {
    _map = new HashMap<>();
    _map.put("I", 1);
    _map.put("IV", 4);
    _map.put("V", 5);
    _map.put("IX", 9);
    _map.put("X", 10);
    _map.put("XL", 40);
    _map.put("L", 50);
    _map.put("XC", 90);
    _map.put("C", 100);
    _map.put("CD", 400);
    _map.put("D", 500);
    _map.put("CM", 900);
    _map.put("M", 1000);
  }

  public int toInt(String symbol) {
    int value = 0;
    for (int i = 0; i < symbol.length(); ++i) {
      String current = "" + symbol.charAt(i);
      if (isMultiCharacterSymbol(symbol, i, current)) {
        value += _map.get(current + symbol.charAt(i + 1));
        i = i + 1;
      } else {
        value += _map.get(current);
      }
    }
    return value;
  }

  private boolean isMultiCharacterSymbol(String symbol, int i, String current) {
    return i + 1 < symbol.length() && _map.containsKey(current + symbol.charAt(i + 1));
  }
}
