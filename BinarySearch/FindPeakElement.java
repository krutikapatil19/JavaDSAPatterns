public class FindPeakElement {
    public static int findPeak(int[]nums){

        int left = 0;
        int right = nums.length-1;

        while(left<right){
        int mid = (left+right)/2;

        if(nums[mid]< nums[mid+1]){
            //it tells the peak is in right direction
            left = mid+1;
        } else {
            //going downhill, peak is at the mid,or the left side
            right = mid;
        }
    }
    return left;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeak(nums));
    }
}
