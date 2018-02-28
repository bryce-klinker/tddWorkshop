public class BangMatcher extends Matcher {
    @Override
    public boolean isMatch(int value) {
        return value == 7;
    }

    @Override
    public String getResult() {
        return "Bang";
    }
}
