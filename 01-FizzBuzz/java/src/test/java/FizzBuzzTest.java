import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
    public void shouldReturn1For1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(1);
        assertEquals("1", actualReturnValue);
    }

    @Test
    public void shouldReturn2For2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualReturnValue = fizzBuzz.process(2);
        assertEquals("2", actualReturnValue);
    }

    @Test
    public void shouldReturnFizzFor3() {
	    FizzBuzz fizzBuzz = new FizzBuzz();
	    String actual = fizzBuzz.process(3);
	    assertEquals("Fizz", actual);
    }
}