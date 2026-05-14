public class PalindromeCheck {
    public static boolean isPalindrome(String s){

        //used two pointers , i and j , i starts at the beginning ,and j starts at end of array , they will traverse towards each other and loop will run until i crosses j , along with that we will compare the char at i and j are equal or not.
        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j)){     //if the characters doesnt match , then return false (bcoz the string cant be a palindrome)
                return false;
            }
            i++;
            j--;
        }
        return true;    //if all characters at i and j match , then the string is palindrome
    }
    public static void main(String[] args){
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
