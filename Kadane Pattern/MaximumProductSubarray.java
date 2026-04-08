public class MaximumProductSubarray {
    public static int maxProduct(int[] nums){
        int currMax = nums[0];          //max product ending here 
        int currMin = nums[0];          //min product ending here (for negatives)
        int maxProduct = nums[0];       //result will be stored in maxProduct

        for(int i = 1;i<nums.length;i++){

            int prevMax = currMax;      //store old max
            int prevMin = currMin;      //store old min

            /*try 3 options : 
            1.Take current element alon
            2.Multiply with prev max
            3.multiply with prev min (imp for negative flip) */
            currMax = Math.max(nums[i], Math.max( nums[i]*prevMax, nums[i]*prevMin));

            currMin = Math.min(nums[i], Math.min( nums[i]*prevMax, nums[i]*prevMin));

            maxProduct = Math.max(maxProduct, currMax);     //comparison between maxProduct and currMax and update the final answer(that produces the maximum product)

        }
        return maxProduct;
    }
    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
