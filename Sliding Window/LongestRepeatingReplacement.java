import java.util.HashMap;
public class LongestRepeatingReplacement {
    public static int longestRepeatingCharReplacement(String s, int k){

        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int windowLength = 0;
        int maxFreq=0;

        for(int right = 0; right<s.length(); right++){
            char ch = s.charAt(right);
        }
                while((windowLength - maxFreq)>k){
            //shrink window
        }
        //shrink window
        //Replacement needed = Window length - Most Frequent character count 
    }
    public static void main(String[] args){
        String s = "ABAB";
        int k = 2;
        System.out.println(longestRepeatingCharReplacement(s,k));
    }
}
