import java.util.Arrays;

public class Anagram {
    static boolean isAnagram(String s, String t) {
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
