public class HappyNumber {
    public static boolean isHappyNumber(int n){


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
    }
   public static void main(String[] args){
    int n = 23;
    System.out.println(isHappyNumber(n));
   } 
}
