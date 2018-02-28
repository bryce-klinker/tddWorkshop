import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
    public void shouldReturn1for1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(1);
        assertEquals("1", actualReturnValue);
    }

    @Test
    public void shouldReturn2for2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(2);
        assertEquals("2", actualReturnValue);
    }
}