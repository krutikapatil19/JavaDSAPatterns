public class FindMaxAndMinElement {
    public static int[] findMaximumAndMinimumElement(int[] nums){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] maxAndMin = {max,min};
        
        for(int i = 0;i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            } 
            else if(nums[i]>max){
                max = nums[i];
            }
        }
        return maxAndMin;
    }
    public static void main(String[] args){
        int[] nums = {2,10,12,20,190};
        System.out.println(Arrays.toString(findMaximumAndMinimumElement(nums)));
    }
}
