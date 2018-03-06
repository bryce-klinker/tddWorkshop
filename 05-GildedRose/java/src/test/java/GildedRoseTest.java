import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GildedRoseTest {

  @Test
  public void shouldDecreaseQualityOfItems() {
    GildedRose.main(null);

    assertItemEquals("+5 Dexterity Vest", 9, 19, GildedRose.items.get(0));
    assertItemEquals("Aged Brie", 1, 1, GildedRose.items.get(1));
    assertItemEquals("Elixir of the Mongoose", 4, 6, GildedRose.items.get(2));
    assertItemEquals("Sulfuras, Hand of Ragnaros", 0, 80, GildedRose.items.get(3));
    assertItemEquals("Backstage passes to a TAFKAL80ETC concert", 14, 21, GildedRose.items.get(4));
    assertItemEquals("Conjured Mana Cake", 2, 5, GildedRose.items.get(5));
  }

  @Test
  public void shouldContinueToDecreaseQualityOfItemsAfterTwoDays() {
    GildedRose.main(null);
    GildedRose.updateQuality();

    assertItemEquals("+5 Dexterity Vest", 8, 18, GildedRose.items.get(0));
    assertItemEquals("Aged Brie", 0, 2, GildedRose.items.get(1));
    assertItemEquals("Elixir of the Mongoose", 3, 5, GildedRose.items.get(2));
    assertItemEquals("Sulfuras, Hand of Ragnaros", 0, 80, GildedRose.items.get(3));
    assertItemEquals("Backstage passes to a TAFKAL80ETC concert", 13, 22, GildedRose.items.get(4));
  }

  @Test
  public void shouldIncreaseQualityTwoForBackstageItemWhenSellInLessThanEleven() {
    String name = "Backstage passes to a TAFKAL80ETC concert";
    Item item = new Item(name, 10, 12);
    GildedRose.updateItem(item);
    assertItemEquals(name, 9, 14, item);
  }

  @Test
  public void shouldIncreaseQualityThreeForBackstageItemWhenSellInLessThanSix() {
    String name = "Backstage passes to a TAFKAL80ETC concert";
    Item item = new Item(name, 5, 12);
    GildedRose.updateItem(item);
    assertItemEquals(name, 4, 15, item);
  }

  @Test
  public void shouldSetQualityOfBackstagePassToZeroAfterSellIn() {
    String name = "Backstage passes to a TAFKAL80ETC concert";
    Item item = new Item(name, 0, 12);
    GildedRose.updateItem(item);
    assertItemEquals(name, -1, 0, item);
  }

  @Test
  public void shouldDecreaseQualityByTwoIfSellInIsLessThanZero() {
    String name = "+5 Dexterity Vest";
    Item item = new Item(name, -1, 12);
    GildedRose.updateItem(item);
    assertItemEquals(name, -2, 10, item);
  }

  @Test
  public void shouldIncreaseQualityOfAgedBrieIfPastSellIn() {
    String name = "Aged Brie";
    Item item = new Item(name, 0, 12);
    GildedRose.updateItem(item);
    assertItemEquals(name, -1, 14, item);
  }

  private void assertItemEquals(String expectedName, int expectedSellIn, int expectedQuality, Item actualItem) {
    assertEquals(expectedName, actualItem.name);
    assertEquals(expectedQuality, actualItem.quality);
    assertEquals(expectedSellIn, actualItem.sellIn);
  }
}
