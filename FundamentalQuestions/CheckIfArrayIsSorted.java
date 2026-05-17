public class CheckIfArrayIsSorted {
    public static boolean checkSortedArray(int[] nums){

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums = {2,8,10,12,30};
        System.out.println(checkSortedArray(nums));
    }
}
