package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String[] e = str.split("");
        e[str.length() / 2] = e[str.length() / 2].toUpperCase();
        return String.join("", e);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String[] e = str.split("");
        e[str.length() / 2] = e[str.length() / 2].toLowerCase();
        return String.join("", e);
    }

    public static Boolean isIsogram(String str) {
        String[] a = str.split("");
        Boolean result = true;
        for (int i = 0; i<a.length; i++) {
            for(int j = i+1; j<a.length; j++){
                if(a[i].equals(a[j]))
                    result = false;
            }
        }
        return result;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String[] a = str.split("");
        Boolean result = false;
        for (int i = 0; i<a.length -1; i++) {
            if(a[i].equals(a[i+1]))
                result = true;
        }
        return result;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        ArrayList<String> a = Arrays.stream(str.split("")).collect(Collectors.toCollection(ArrayList::new));
        for (int i = 0; i<a.size()-1; i++) {
            if(a.get(i).equals(a.get(i+1))) {
                a.remove(i + 1);
                a.remove(i);
            }
        }
        return a.stream().collect(Collectors.joining());
    }

    public static String invertCasing(String str) {
        String result = "";
        for (Character each :
                str.toCharArray()) {
            if(Character.isAlphabetic(each)) {
                if (Character.isUpperCase(each))
                    result += each.toString().toLowerCase();
                else
                    result += each.toString().toUpperCase();
            }else
                result += each.toString();
        }
        return result;
    }
}