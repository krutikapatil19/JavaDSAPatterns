public class PermutationInString {
    public static boolean checkInclusion (String s1, String s2){

        //if s1 is bigger - > inclusion is not possible in s2
        if(s1.length()>s2.length()){
            return false;
        }

        //Freqency arrays
        int[] need = new int[26];       //freq of s1
        int[] window = new int[26];     //freq of current window in s2

        //Fill need array from s1
        for(char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int k = s1.length();        //window size

        //build first window
        for(int i = 0; i<k; i++){
            window[s2.charAt(i) - 'a']++;
        }

        //Check first window
        if(matches(need, window)) return true;

        //Slide Window
        for(int i = k; i<s2.length(); i++){

            //Add New character
            window[s2.charAt(i) - 'a']++;

            //remove leftmost character
            window[s2.charAt(i-k) - 'a']--;

            //Check after update
            if(matches(need, window))return true;
        }
        //No match found 
        return false;
    }

    //function for comparing both freq arrays
    public static boolean matches(int[] a, int[] b){ 
        for(int i = 0; i<26; i++){
            if(a[i] !=b[i]) return false ;
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}

//Eg. Take a box of size 2 (i.e of the size s1) , and keep shifting it , ,and check if its content matches s1.