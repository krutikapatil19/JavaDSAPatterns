import java.util.HashSet;
public class HappyNumber {
    public static boolean isHappyNumber(int n){

        //happy number logic 
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            {
                set.add(n);
                n = findSquareSum(n);
            }
        }
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
