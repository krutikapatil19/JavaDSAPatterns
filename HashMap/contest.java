public class contest {
    public static boolean isMiddleElementUnique(int[] nums) {
        int mid = (nums.length) /2;
        int middleElement = nums[mid];

        int count = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]== middleElement){
                count++;
            }
        }
        return count ==1;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        System.out.println(isMiddleElementUnique(nums));
    }
}
