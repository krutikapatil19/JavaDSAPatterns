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
            //update s freq
            //update window freq
        }
        }
    public static void main(String[] args){
        String s = "ab";
        String t = "eidbaooo";
        System.out.println(isPermutation(s,t));
    }
}
