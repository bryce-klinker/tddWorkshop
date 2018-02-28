public abstract class Matcher {
    public static final Matcher[] All = new Matcher[]{new FizzMatcher(), new BuzzMatcher(), new BangMatcher()};

    public abstract boolean isMatch(int value);

    public abstract String getResult();
}

