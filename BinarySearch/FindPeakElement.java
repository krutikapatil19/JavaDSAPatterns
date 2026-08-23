public class FindPeakElement {
    public static int findPeak(int[]nums){

        int left = 0;
        int right = nums.length-1;

        int mid = (left+right)/2;

        if(nums[mid]< nums[mid+1]){
            //it tells the peak is in right direction
            left = mid+1;
        } else {
            right = mid-1;
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeak(nums));
    }
}
