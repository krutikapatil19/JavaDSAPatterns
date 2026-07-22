public class PermutationInString1 {
    public static boolean isPermutation(String s , String t){

        int windowSize = s.length();

        //Base Case : if s length is greater than t , then t can never contain the permutation of s (as its larger than s)
        if(s.length()>t.length()){
            return false;
        }

        //frequency array
        int[] frequency = new int[26];
        }
    public static void main(String[] args){
        String s = "ab";
        String t = "eidbaooo";
        System.out.println(isPermutation(s,t));
    }
}
