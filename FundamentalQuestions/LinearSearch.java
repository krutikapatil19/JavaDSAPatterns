public class LinearSearch{
    public static int linearsearchh(int[]nums , int target){

        int i = 0;
        for(i = 0;i<nums.length; i++){
            if(nums[i]==target){
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,4,10,12,15};
        int target = 1;
        System.out.println(linearsearchh(nums, target));
    }
}