public class MaxSubSumWithOneDeletion {
    public static int maximumSum(int[] nums){
        int noDeletionSum = nums[0];
        int oneDeletionSum = 0;
        //int currSum = 0;
        int maxSum = nums[0];

        for(int i = 1;i<nums.length;i++){

            int prevNoDeletion = noDeletionSum;

            oneDeletionSum = Math.max(oneDeletionSum + nums[i], prevNoDeletion);

            noDeletionSum = Math.max(nums[i], noDeletionSum + nums[i]);

            maxSum = Math.max(maxSum, Math.max(noDeletionSum, oneDeletionSum));
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {1,-2,0,3};
        System.out.println(maximumSum(nums));
    }
}
