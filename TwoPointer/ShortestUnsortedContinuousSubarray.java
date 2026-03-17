public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums){

    
        //variables for boundaries
        int left = -1;
        int right = -1;

        int length = 0;

        for(int i= 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                left = i;
                break;
            }else continue;
        } 

        for(int j=nums.length-1;j>0;j--){
            if(nums[j]<nums[j-1]){
                right = j;
                break;
            } continue;
        }
        
            length = right -left+1;
        return length;
    }
    public static void main(String[] args){
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
