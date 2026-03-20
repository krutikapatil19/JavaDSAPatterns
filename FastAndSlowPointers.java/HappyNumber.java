public class HappyNumber {
    public static int next(int n){

        int sum = 0;
       
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n = n/10;
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
