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
		for (int i = 0; i < GildedRose.items.size(); ++i) {
		  Item item = GildedRose.items.get(i);
		  System.out.println("Item: " + item.name +  " quality: " + item.quality + " sellin: " + item.sellIn);
    }
  }

  private void assertItemEquals(String expectedName, int expectedQuality, int expectedSellIn, Item actualItem) {
    assertEquals(expectedName, actualItem.name);
    assertEquals(expectedQuality, actualItem.quality);
    assertEquals(expectedSellIn, actualItem.sellIn);
  }
}
