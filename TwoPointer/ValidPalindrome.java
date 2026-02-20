public class ValidPalindrome {
    public static boolean isPalindrome(String s){

        int i = 0, j= s.length()-1;

        while(i<j){
            while(i<  j && !Character.isLetterOrDigit(s.charAt(i))){        //skip spaces/symbols from left 
                i++;
            }

            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){          //skip spaces/symbols from right 
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){       //compares characters from both sides , if they don't match , then return false ,i.e its not palindrome
                return false;
            }
            i++;            //move both pointers inward     
            j--;            //move it inward , if both sides characters keep matching 
        }
        return true;        //if no mismatch -> then its a palindrome
    }
    public static void main(String[] args){
        String s = "madam";
        System.out.println(isPalindrome(s));
    }
}
