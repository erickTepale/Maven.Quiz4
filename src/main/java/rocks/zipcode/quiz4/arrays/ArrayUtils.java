package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> temp = Arrays.stream(values).collect(Collectors.toCollection(ArrayList::new));
        temp.remove(temp.get(temp.size() / 2));
        return temp.stream().toArray(String[]::new);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> temp = Arrays.stream(values).collect(Collectors.toCollection(ArrayList::new));
        temp.remove(temp.size() -1);
        return temp.stream().toArray(String[]::new);
    }
}