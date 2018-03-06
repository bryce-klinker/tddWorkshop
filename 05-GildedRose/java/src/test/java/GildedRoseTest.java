import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GildedRoseTest {

  @Test
  public void shouldDecreaseQualityOfItems() {
    GildedRose.main(null);

    assertItemEquals("+5 Dexterity Vest", 19, 9, GildedRose.items.get(0));
    assertItemEquals("Aged Brie", 1, 1, GildedRose.items.get(1));
    assertItemEquals("Elixir of the Mongoose", 6, 4, GildedRose.items.get(2));
    assertItemEquals("Sulfuras, Hand of Ragnaros", 80, 0, GildedRose.items.get(3));
    assertItemEquals("Backstage passes to a TAFKAL80ETC concert", 21, 14, GildedRose.items.get(4));
    assertItemEquals("Conjured Mana Cake", 5, 2, GildedRose.items.get(5));
  }

  @Test
  public void shouldContinueToDecreaseQualityOfItemsAfterTwoDays() {
    GildedRose.main(null);
    GildedRose.updateQuality();

    assertItemEquals("+5 Dexterity Vest", 18, 8, GildedRose.items.get(0));
    assertItemEquals("Aged Brie", 2, 0, GildedRose.items.get(1));
    assertItemEquals("Elixir of the Mongoose", 5, 3, GildedRose.items.get(2));
    assertItemEquals("Sulfuras, Hand of Ragnaros", 80, 0, GildedRose.items.get(3));
    assertItemEquals("Backstage passes to a TAFKAL80ETC concert", 22, 13, GildedRose.items.get(4));
  }

  private void assertItemEquals(String expectedName, int expectedQuality, int expectedSellIn, Item actualItem) {
    assertEquals(expectedName, actualItem.name);
    assertEquals(expectedQuality, actualItem.quality);
    assertEquals(expectedSellIn, actualItem.sellIn);
  }
}
