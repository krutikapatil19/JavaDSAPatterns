import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FindAnagramsInString {
    public static List<Integer>  isAnagram(String s, String p){

        List<Integer> result = new ArrayList<>();
    
        int windowSize = p.length();

        //base case
        if(p.length()>s.length()){
            return result;
        }

        //create freq arrays
        int[] pFreq = new int[26];              //frequency of chars in p
        int[] windowFreq = new int[26];         //freq of chars in current window of s
    
        for(int i = 0;i<windowSize;i++){

            //count chars of p
            pFreq[p.charAt(i)-'a']++;

            //count chars of first window of s
            windowFreq[s.charAt(i)-'a']++;

            if(Arrays.equals(pFreq,windowFreq)){
                result.add(0);
            }
        }

        //Build frequencies
        for(int i = windowSize; i<s.length();i++){

            //remove leftmost character

            //add rightmost character

            //Compare frequencies
            if(Arrays.equals(pFreq, windowFreq)){

                //If equal, add starting index
                result.add (i-windowSize + 1);
            }
        }

    return result;
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(isAnagram(s,p));
    }
}
