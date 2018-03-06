import org.junit.Test;


public class GildedRoseTest {

  @Test
  public void shouldDecreaseQualityOfItems() {
    GildedRose.main(null);
		for (int i = 0; i < GildedRose.items.size(); ++i) {
		  Item item = GildedRose.items.get(i);
		  System.out.println("Item: " + item.name +  " quality: " + item.quality + " sellin: " + item.sellIn);
    }
  }
}
