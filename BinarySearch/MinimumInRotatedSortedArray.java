public class MinimumInRotatedSortedArray {
    public static int findMinimum(int[] nums){

        int left = 0;
        int right = nums.length-1;
        int minimum=Integer.MAX_VALUE;

        while(left<=right){
            int mid = (left+right)/2;

            //checking which half is sorted
            if(nums[left]<=nums[mid]){
                minimum = nums[left];
            } else {
                minimum = nums[mid];
            }
        }
        return minimum;
    }
    public static void main(String[] args){
        int[] nums = {3,4,5,1,2};
        System.out.println(findMinimum(nums));
    }
}
