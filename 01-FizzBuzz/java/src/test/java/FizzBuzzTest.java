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
        String actual = _fizzBuzz.process(1);
        assertEquals("1", actual);
    }

    @Test
    public void shouldReturn2For2() {
        String actual = _fizzBuzz.process(2);
        assertEquals("2", actual);
    }

    @Test
    public void shouldReturnFizzFor3() {
	    String actual = _fizzBuzz.process(3);
	    assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzzFor5() {
        String actual = _fizzBuzz.process(5);
        assertEquals("Buzz", actual);
    }

    @Test
    public void shouldReturnFizzForValueDivisibleByThree() {
        String actual = _fizzBuzz.process(6);
        assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzzForValueDivisibleByFive() {
        String actual = _fizzBuzz.process(10);
        assertEquals("Buzz", actual);
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        String actual = _fizzBuzz.process(15);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void shouldReturnFizzBuzzForValueDivisibleByThreeAndFive() {
        String actual = _fizzBuzz.process(30);
        assertEquals("FizzBuzz", actual);
    }
}