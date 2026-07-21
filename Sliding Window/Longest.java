import java.util.HashMap;
public class Longest {
    public static int LongestCharReplacement(String s, int k){

        HashMap<Character,Integer>map = new HashMap<>();
        int left=0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
            map.put(map.getOrDefault(ch,0)+1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;
        System.out.println(LongestCharReplacement(s,k));
    }
}
