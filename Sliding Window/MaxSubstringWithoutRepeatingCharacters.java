import java.util.HashMap;
public class MaxSubstringWithoutRepeatingCharacters {
    public static int largestUniqueSubstring(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;

        for(int j = 0; j<str.length();j++){
            char c = str.charAt(j);

            //If character seen before , move i
            if(map.containsKey(c)){
                i = Math.max(i, map.get(c)+1);
            }

            map.put(c,j);
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        String str = "abccbad";
        System.out.println(largestUniqueSubstring(str));
    }
}
