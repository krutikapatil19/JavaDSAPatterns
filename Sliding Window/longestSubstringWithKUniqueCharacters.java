import java.util.HashMap;
public class longestSubstringWithKUniqueCharacters {
    public static int lengthOfLongestKSubstring(String s, int k){

        int left = 0;       //start of window 
        int maxLength=0;    //length of substring with k distinct chracters

        //using HashMap to store frequency
        HashMap<Character,Integer> map = new HashMap<>();

        for(int right= 0;right<s.length();right++){
            char ch = s.charAt(right);

            //Add character to window(increse frequency)
            map.put(ch, map.getOrDefault(ch,0) + 1);
        
            //shrink window if more than k unique characters
            while(map.size()>k){
            char leftChar = s.charAt(left);

            map.put(leftChar, map.get(leftChar)-1); //decrease freq

            //if frequency becomes 0 -> remov from map
            if(map.get(leftChar)==0){
                map.remove(leftChar);
            }
            left++;     //move left pointer
        }

        //store answer when exactly k unique characters
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
