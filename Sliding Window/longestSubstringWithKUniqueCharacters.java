import java.util.HashMap;
public class longestSubstringWithKUniqueCharacters {
    public static int lengthOfLongestKSubstring(String s, int k){

        int left = 0;
        int maxLength=0;

        //using HashMap to store k distinct characters
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right= 0;right<s.length();right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        
        //shrink window if more than k unique characters
        while(map.size()>k){
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar)-1); //decrease freq

            //shrink window
            //if frequency becomes 0 -> remov from map
            if(map.get(leftChar)==0){
                map.remove(leftChar);
            }
            left++;
        }
        if(map.size() == k){
        maxLength = Math.max(maxLength, right-left+1);
    }
}
        return maxLength;
    }
    public static void main(String[] args){
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(lengthOfLongestKSubstring(s,k));
    }
}
