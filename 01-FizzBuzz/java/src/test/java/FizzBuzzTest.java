import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private FizzBuzz _fizzBuzz;

    @Before
    public void setUp() {
        _fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1For1() {
        String actualReturnValue = _fizzBuzz.process(1);
        assertEquals("1", actualReturnValue);
    }

    @Test
    public void shouldReturn2For2() {
        String actualReturnValue = _fizzBuzz.process(2);
        assertEquals("2", actualReturnValue);
    }

    @Test
    public void shouldReturnFizzFor3() {
	    String actual = _fizzBuzz.process(3);
	    assertEquals("Fizz", actual);
    }
}