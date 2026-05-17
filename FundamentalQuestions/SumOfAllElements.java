public class SumOfAllElements {
    public static int totalSum(int[]nums){

        int sum = 0;
        for(int i = 0;i<nums.length; i++){
            sum+= nums[i];
        }
        return sum;
    }
    public  static void main(String[]args){
        int[] nums = {10,2,4,20};
        System.out.println(totalSum(nums));
    }
}