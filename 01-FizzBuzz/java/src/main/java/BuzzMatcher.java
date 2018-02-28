public class BuzzMatcher extends Matcher {

    @Override
    public boolean isMatch(int value) {
        return value % 5 == 0;
    }

    @Override
    public String getResult() {
        return "Buzz";
    }
}
