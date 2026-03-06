public class SubarrayProductLessThanK {
    public static int subarraysProduct(int[] nums,int target){

        int left = 0;   //start of sliding window
        
        int count = 0;  //to store total number of valid subarrays

        int currentProduct = 1; //product of elements inside the window 


            //if target <= 1 , no subarray product can be less than it 
            if(target <= 1) return 0;

            //right pointer moves through the array (expands the window)
            for(int right = 0;right<nums.length;right++){
            currentProduct *= nums[right];

            while(currentProduct>=target){
                //shrink the window
                currentProduct /= nums[left];
                left++;
            } 
            count += right - left +1;
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {10,5,2,6};
        int target = 100;
        System.out.println((subarraysProduct(nums,target)));
    }
}
