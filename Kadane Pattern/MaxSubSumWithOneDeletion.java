public class MaxSubSumWithOneDeletion {
    public static int maximumSum(int[] nums){

        int noDeletionSum = nums[0];            //max Sum without deleting anything
        int oneDeletionSum = nums[0];           //max Sum with ONE deletion used
        int maxSum = nums[0];                   //overall best answerr 

        for(int i = 1;i<nums.length;i++){

            int prevNoDeletion = noDeletionSum; //store old value before update 

            /*2 Choices: 
            1.continue after deletion
            2.delete current element (take prev noDeletion)
            */
            oneDeletionSum = Math.max(oneDeletionSum + nums[i], prevNoDeletion);

            //Normal Kadane (no deletion case)
            noDeletionSum = Math.max(nums[i], noDeletionSum + nums[i]);

            //Update final answer from both
            maxSum = Math.max(maxSum, Math.max(noDeletionSum, oneDeletionSum));
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {1,-2,0,3};
        System.out.println(maximumSum(nums));
    }
}
