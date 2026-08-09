public class SearchInRotatedSortedArray {
    public static int searchIndexOfTarget(int[]nums, int target){

        int ans = -1;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                ans = mid;
                return ans;
            } 
            else if (nums[left] <= target && target <= nums[mid]){
                //it means the target is between the left and mid pointer.(left half's range)
                right =mid-1;
            } else {
                //else ,the target must be in the right half.
                left = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[]nums = {0,1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(searchIndexOfTarget(nums,target));
    }
}
