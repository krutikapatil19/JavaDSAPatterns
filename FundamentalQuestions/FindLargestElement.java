public class FindLargestElement {
    public static int findLargestNumber(int[] nums){

        int max = 0;
        for(int i = 0;i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }  
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {10,12,6,8,202,36};
        System.out.println(findLargestNumber(nums));
    }
}
