public class FizzBuzz {

    public String process(Integer inputValue) {
        if (inputValue % 3 == 0 && inputValue % 5 == 0)
            return "FizzBuzz";

        if (inputValue % 3 == 0)
            return "Fizz";

        if (inputValue % 5 == 0)
            return "Buzz";
        return inputValue.toString();
    }
}
