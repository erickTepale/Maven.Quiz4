package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {
    private String[] words;

    public WordCounter(String... strings) {
        this.words = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        // find out how this works doe
        return Arrays.stream(words).collect(Collectors.toMap(Function.identity(), e -> 1, Math::addExact, HashMap<String, Integer>::new));
    }
}
