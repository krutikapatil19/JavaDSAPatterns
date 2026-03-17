public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums){

    
        //variables for boundaries
    
        int min = nums[left];
        int max = nums[left];

        int left = -1;
        int right = -1;

        if(left == -1)return 0;
        int length = 0;

        for(int i= 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                left = i;
                break;
            }
        } 

        for(int j=nums.length-1;j>0;j--){
            if(nums[j]<nums[j-1]){
                right = j;
                break;
            } 
        }
        for(int k = left; k<=right; k++){
            if(nums[k] < min) {
                min = nums[k];
            }

            if(nums[k] > max){
                max = nums[k];
            }
        }
    

            while(left >0 && nums[left-1] > min){
                left--;
            }
            while(right<nums.length-1 && nums[right +1] <max){
                right++;
            }

             length = right -left+1;
             
        return length;
    }
    public static void main(String[] args){
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
