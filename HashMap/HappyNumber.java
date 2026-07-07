import java.util.HashSet;
public class HappyNumber {

    //function to check whether a number is happy or not
    public static boolean isHappyNumber(int n){

        //happy number logic 
        //HashSet stores all the sums to detect a repeating cycle
        HashSet<Integer> set = new HashSet<>();

        //repeat until the number becomes 1 
        while(n != 1){

            //if the number is already present , a cycle is found 
            if(set.contains(n)){
                return false;
            }
            //store the current number in the HashSet
            else
            {
                set.add(n);

                //calculate the next number (sum of squares of digits)
                n = findSquareSum(n);
            }
        }
        //number reached 1 , so it is a happy number 
        return true;
    }

    //Function to calculate the sum of squares of digits 
        public static int findSquareSum(int n){

            int sum = 0;

            //Traverse every digit of the number
            while(n>0){

                //Extract the last digit
                int digit = n % 10;

                //Add the square of the digit to the sum
                sum = sum + (digit*digit);

                //Remove the last digit
                n = n/10;
            }
            //return the calculate sum 
            return sum;
        }
   public static void main(String[] args){
    int n = 19;
    System.out.println(isHappyNumber(n));
   } 
}
