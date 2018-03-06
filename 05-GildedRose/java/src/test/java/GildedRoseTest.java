import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GildedRoseTest {

  @Test
  public void shouldDecreaseQualityOfItems() {
    GildedRose.main(null);
    assertEquals("+5 Dexterity Vest", GildedRose.items.get(0).name);
    assertEquals(19, GildedRose.items.get(0).quality);
    assertEquals(9, GildedRose.items.get(0).sellIn);
		for (int i = 0; i < GildedRose.items.size(); ++i) {
		  Item item = GildedRose.items.get(i);
		  System.out.println("Item: " + item.name +  " quality: " + item.quality + " sellin: " + item.sellIn);
    }
  }
}
