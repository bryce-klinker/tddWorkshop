import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzBangTest {

    private FizzBuzzBang _fizzBuzzBang;

    @Before
    public void setUp() {
        _fizzBuzzBang = new FizzBuzzBang();
    }

    @Test
    public void shouldReturn1For1() {
        String actual = _fizzBuzzBang.process(1);
        assertEquals("1", actual);
    }

    @Test
    public void shouldReturn2For2() {
        String actual = _fizzBuzzBang.process(2);
        assertEquals("2", actual);
    }

    @Test
    public void shouldReturnFizzFor3() {
	    String actual = _fizzBuzzBang.process(3);
	    assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzzFor5() {
        String actual = _fizzBuzzBang.process(5);
        assertEquals("Buzz", actual);
    }

    @Test
    public void shouldReturnFizzForValueDivisibleByThree() {
        String actual = _fizzBuzzBang.process(6);
        assertEquals("Fizz", actual);
    }

    @Test
    public void shouldReturnBuzzForValueDivisibleByFive() {
        String actual = _fizzBuzzBang.process(10);
        assertEquals("Buzz", actual);
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        String actual = _fizzBuzzBang.process(15);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void shouldReturnFizzBuzzForValueDivisibleByThreeAndFive() {
        String actual = _fizzBuzzBang.process(30);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void shouldReturnBangFor7() {
        String actual = _fizzBuzzBang.process(7);
        assertEquals("Bang", actual);
    }
}