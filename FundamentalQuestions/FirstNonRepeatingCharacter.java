import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first character with frequency 1
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        // If no non-repeating character exists
        return 0;
    }
    public static void main(String[] args) {
        String s = "leetcode";

        char result = findFirstNonRepeating(s);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
