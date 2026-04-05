import java.util.HashMap;
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t){

        int left = 0;
        int formed = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap <Character,Integer> window = new HashMap<>();

            for(char ch : t.toCharArray()){
                need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
            int required = need.size();

        for(int right = 0;right<s.length();right++){

            //taking current char
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1); 
        
        while(formed == required){

            if(right - left + 1 <minLength){
                minLength = right - left +1;
                startIndex = left;
            }
            char leftChar = s.charAt(left);
            //shrink
            window.put(leftChar, window.get(leftChar) - 1);
        }
    }
    return minLength == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLength);

    }
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
