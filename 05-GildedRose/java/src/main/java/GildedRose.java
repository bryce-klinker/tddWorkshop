import java.util.ArrayList;
import java.util.List;


public class GildedRose {

  public static List<Item> items = null;

  /**
   * @param args
   */
  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items = new ArrayList<>();
    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();
  }

  public static void updateQuality() {
    for (int i = 0; i < items.size(); i++) {
      updateItem(items.get(i));
    }
  }

  public static void updateItem(Item currentItem) {
    switch (currentItem.getName()) {
      case "Sulfuras, Hand of Ragnaros":
        updateSulfuras(currentItem);
        return;
      case "Aged Brie":
        updateBrie(currentItem);
        return;
      case "Backstage passes to a TAFKAL80ETC concert":
        updateBackstage(currentItem);
        return;
    }
    if ((!"Aged Brie".equals(currentItem.getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(currentItem.getName())) {
      if (currentItem.getQuality() > 0) {
        if (!"Sulfuras, Hand of Ragnaros".equals(currentItem.getName())) {
          currentItem.setQuality(currentItem.getQuality() - 1);
        }
      }
    } else {
      if (currentItem.getQuality() < 50) {
        currentItem.setQuality(currentItem.getQuality() + 1);

        if ("Backstage passes to a TAFKAL80ETC concert".equals(currentItem.getName())) {
          if (currentItem.getSellIn() < 11) {
            if (currentItem.getQuality() < 50) {
              currentItem.setQuality(currentItem.getQuality() + 1);
            }
          }

          if (currentItem.getSellIn() < 6) {
            if (currentItem.getQuality() < 50) {
              currentItem.setQuality(currentItem.getQuality() + 1);
            }
          }
        }
      }
    }

    if (!"Sulfuras, Hand of Ragnaros".equals(currentItem.getName())) {
      currentItem.setSellIn(currentItem.getSellIn() - 1);
    }

    if (currentItem.getSellIn() < 0) {
      if (!"Aged Brie".equals(currentItem.getName())) {
        if (!"Backstage passes to a TAFKAL80ETC concert".equals(currentItem.getName())) {
          if (currentItem.getQuality() > 0) {
            if (!"Sulfuras, Hand of Ragnaros".equals(currentItem.getName())) {
              currentItem.setQuality(currentItem.getQuality() - 1);
            }
          }
        } else {
          currentItem.setQuality(0);
        }
      } else {
        if (currentItem.getQuality() < 50) {
          currentItem.setQuality(currentItem.getQuality() + 1);
        }
      }
    }
  }

  private static void updateBackstage(Item currentItem) {
    if (currentItem.getSellIn() < 11) {
      if (currentItem.getQuality() < 50) {
        currentItem.setQuality(currentItem.getQuality() + 1);
      }
    }

    if (currentItem.getSellIn() < 6) {
      if (currentItem.getQuality() < 50) {
        currentItem.setQuality(currentItem.getQuality() + 1);
      }
    }

    currentItem.setSellIn(currentItem.getSellIn() - 1);
    if (currentItem.getQuality() < 50) {
      currentItem.setQuality(currentItem.getQuality() + 1);
    }

    if (currentItem.getSellIn() < 0)
      currentItem.setQuality(0);
  }

  private static void updateBrie(Item currentItem) {
    currentItem.setQuality(currentItem.getQuality() + 1);
    currentItem.setSellIn(currentItem.getSellIn() - 1);
    if (currentItem.getSellIn() < 0)
      currentItem.setQuality(currentItem.getQuality() + 1);
  }

  private static void updateSulfuras(Item currentItem) {

  }
}