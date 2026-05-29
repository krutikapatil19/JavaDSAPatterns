public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
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
