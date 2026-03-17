public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums){

        //variables for boundaries
        int left = -1;          //left -> start of unsorted part 
        int right = -1;         //right -> end of unsorted part
        
        int length = 0;

        //1: Find first place from where sorting breaks from left 
        for(int i= 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                left = i;           //unsorted part starts here 
                break;
            }
        } 
        //if array is already sorted , return 0
        if(left == -1)return 0;

        //2.Find first place where sorting breaks from right 
        for(int j=nums.length-1;j>0;j--){
            if(nums[j]<nums[j-1]){
                right = j;      //unsorted part ends here 
                break;
            } 
        }
        //Step 3: Find min and max in the unsorted window 
        int min = nums[left];
        int max = nums[left];

        for(int k = left; k<=right; k++){
            if(nums[k] < min) {
                min = nums[k];      //smallest value in window
            }

            if(nums[k] > max){
                max = nums[k];      //largest value in window 
            }
        }
            //Step 4: Expand left boundary if needed 
            //if elements before left are bigger than min -> include them
            while(left > 0 && nums[left - 1] > min){
                left--;
            }
            //Step 5: Expand right boundary if needed 
            //if elements after right are smaller than max -> include them
            while(right < nums.length - 1 && nums[right + 1] < max){
                right++;
            }

            //length of final unsorted array 
             length = right -left+1;

        return length;
    }
    public static void main(String[] args){
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
