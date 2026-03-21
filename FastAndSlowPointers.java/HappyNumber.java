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
            return sum;     //return new number
        }

        public static boolean isHappyNumber(int n){

            //Initialize two pointers
            int slow = n;
            int fast = n;

            //keep moving until we get result
            while(true){
                slow = next(slow);          //move slow by 1 step
                fast = next(next(fast));    //move fast by 2 steps

                //if fast reaches 1 -> happy number
                if(fast == 1)return true;

                //if both meet -> cycle -> not happy number
                if(slow == fast)return false;
            }
        }
    public static void main(String[] args){
        int n = 2;

        //check and print result 
        System.out.println(isHappyNumber(n));
}
}
