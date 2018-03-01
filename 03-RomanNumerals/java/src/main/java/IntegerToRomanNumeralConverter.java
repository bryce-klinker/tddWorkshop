import java.util.HashMap;
import java.util.TreeSet;

public class IntegerToRomanNumeralConverter {
  private static HashMap<Integer, String> _map;
  private static Iterable<Integer> _sortedKeys;

  static {
    _map = new HashMap<>();
    _map.put(1, "I");
    _map.put(4, "IV");
    _map.put(5, "V");
    _map.put(9, "IX");
    _map.put(10, "X");
    _map.put(40, "XL");
    _map.put(50, "L");
    _map.put(90, "XC");
    _map.put(100, "C");
    _map.put(400, "CD");
    _map.put(500, "D");
    _map.put(900, "CM");
    _map.put(1000, "M");
    _sortedKeys = sortKeys();
  }

  public String toRoman(int value) {
    StringBuilder romanBuilder = new StringBuilder();
    while (value != 0) {
      for (Integer current: _sortedKeys) {
        if (current > value)
          continue;

        value = value - current;
        romanBuilder.append(_map.get(current));
      }
    }

    return romanBuilder.toString();
  }

  private static Iterable<Integer> sortKeys() {
    TreeSet<Integer> list = new TreeSet<>(new DescendingIntegerComparator());
    list.addAll(_map.keySet());
    return list;
  }
}

