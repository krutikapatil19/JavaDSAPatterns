public class CheckIfArrayIsSorted {
    public static boolean isSorted(int[] nums){

        //Loop through each element till second last index (compare current element with the next one , thats y skipping the last one in loop)
        for(int i = 0; i<nums.length-1; i++){
            //check if current number is greater than next element
            if(nums[i]>nums[i+1]){
                
                //if order breaks, array is not sorted
                return false;
            }
        }
        //if loop ends, and no order breaks, then array is sorted.
        return true;
    }
    public static void main(String[] args){
        int[] nums = {2,8,10,12,30};
        System.out.println(isSorted(nums));
    }
}
