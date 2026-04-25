public class MissingNumber {
    public static int findMissingNumber(int[] nums){
        int n = nums.length;

         int actualSum = 0;
            int totalSum = n*(n+1)/2;

            for(int i = 0;i< nums.length;i++){
                actualSum += nums[i];
            }

            int missingNumber = totalSum - actualSum;
    
    return missingNumber;
        }
    public static void main(String[] args){
        int[] nums = {3,0,1};
    System.out.println(findMissingNumber(nums));
}
}
