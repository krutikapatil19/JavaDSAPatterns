public class HappyNumber {

    //Function to get next number(sum of squares of digit)
    public static int next(int n){

        int sum = 0;
       
        //Take each digit and add its square
        while(n > 0){
            int digit = n % 10;     //get last digit 
            sum += digit * digit;   //add square of digit
            n = n/10;               //remove last digit
        }
            return sum;
        }

        public static boolean isHappyNumber(int n){
            int slow = n;
            int fast = n;

            while(true){
                slow = next(slow);
                fast = next(next(fast));

                if(fast == 1)return true;
                if(slow == fast)return false;
            }
        }
    public static void main(String[] args){
        int n = 19;
        System.out.println(isHappyNumber(n));
}
}
