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

        public static int findSquareSum(int n){

            int sum = 0;
            while(n>0){

                //1
                int digit = n % 10;
                //2
                sum = sum + (digit*digit);
                //3
                n = n/10;

            }

            return sum;
        }
   public static void main(String[] args){
    int n = 2;
    System.out.println(isHappyNumber(n));
   } 
}
