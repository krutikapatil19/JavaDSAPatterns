public class SubarrayProductLessThanK {
    public static int subarraysProduct(int[] nums,int target){
        int left = 0;
        
        int count = 0;

        int currentProduct = 1;

            if(target <= 1) return 0;

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
