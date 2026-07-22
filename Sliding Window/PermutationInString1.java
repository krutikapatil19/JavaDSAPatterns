import java.util.Arrays;
public class PermutationInString1 {
    public static boolean isPermutation(String s , String t){

        int windowSize = s.length();

        //Base Case : if s is longer than t , a permutation is impossible.
        if(s.length()>t.length()){
            return false;
        }

        //create frequency array
        int[] sFreq = new int[26];      //stores the freq of characters of s
        int[] windowFreq = new int[26]; //stores the freq of characters in current window of t. //This array keeps changing as the window slides 

        for(int i = 0; i<windowSize; i++){

            //count char of s
            sFreq[s.charAt(i)-'a']++;

            //count characters of first window of t
            windowFreq[t.charAt(i)-'a']++;
        }
        //Comparison of both Arrays
            if(Arrays.equals(sFreq,windowFreq)){
                return true;
            }

            for(int i = windowSize; i<t.length(); i++){
                windowFreq[t.charAt(i-windowSize)- 'a']--;
                windowFreq[t.charAt(i)-'a']++;
            
                if(Arrays.equals(sFreq, windowFreq)){
                    return true;
                }
            }
        return false;
        }
    public static void main(String[] args){
        String s = "ab";
        String t = "eidbaooo";
        System.out.println(isPermutation(s,t));
    }
}
