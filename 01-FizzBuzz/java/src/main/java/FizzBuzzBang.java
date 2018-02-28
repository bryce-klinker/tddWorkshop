import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzzBang {
    public String process(Integer value) {
        String result = getMatches(value)
                .map(Matcher::getResult)
                .collect(Collectors.joining(""));

        if (result.equals(""))
            return value.toString();

        return result;
    }

    private Stream<Matcher> getMatches(int value) {
        return Arrays.stream(Matcher.All)
                .filter(m -> m.isMatch(value));
    }
}

