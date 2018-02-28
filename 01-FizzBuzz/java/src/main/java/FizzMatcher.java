public class FizzMatcher extends Matcher {

    @Override
    public boolean isMatch(int value) {
        return value % 3 == 0;
    }

    @Override
    public String getResult() {
        return "Fizz";
    }
}
