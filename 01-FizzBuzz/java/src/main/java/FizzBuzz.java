public class FizzBuzz {

    private static final String Fizz = "Fizz";
    private static final String Buzz = "Buzz";

    public String process(Integer value) {
        if (isFizz(value) && isBuzz(value))
            return Fizz + Buzz;

        if (isFizz(value))
            return Fizz;

        if (isBuzz(value))
            return Buzz;

        return value.toString();
    }

    private boolean isBuzz(Integer value) {
        return value % 5 == 0;
    }

    private boolean isFizz(Integer value) {
        return value % 3 == 0;
    }
}
