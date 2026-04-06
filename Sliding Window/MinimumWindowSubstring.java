import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        int left = 0; // start of window
        int formed = 0; // how many characters matched
        int minLength = Integer.MAX_VALUE; // smallest window length
        int startIndex = 0;

        HashMap<Character, Integer> need = new HashMap<>(); // what we need
        HashMap<Character, Integer> window = new HashMap<>(); // what we have

        // Build frequency map for String t
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        int required = need.size(); // number of unique characters required

        // Traverse string s using sliding window
        for (int right = 0; right < s.length(); right++) {

            // taking current char
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch) && window.get(ch).intValue() == need.get(ch).intValue()) {
                formed++;
            }

            while (formed == required) {

                // update smallest window
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }
                // removing left character(shrink window)
                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }
                left++; // move left pointer
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
