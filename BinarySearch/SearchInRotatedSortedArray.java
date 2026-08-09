public class SearchInRotatedSortedArray {
    public static int searchIndexOfTarget(int[]nums, int target){

        int ans = -1;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                return mid;
            } 

            else if (nums[left]<=nums[mid]){
                if (nums[left] <= target && target <= nums[mid]){
                //it means the target is between the left and mid pointer.(left half's range)
                right =mid-1;
            } else {
                //else ,the target must be in the right half.
                left = mid+1;
            }
            }else {
                //when the right half is sorted 
                //if target is between nums[mid] and nums[right] 
                if(nums[mid]<=target && target<=nums[right]){
                    left=mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[]nums = {6,7,0,1,2,3,4,5};
        int target = 4;
        System.out.println(searchIndexOfTarget(nums,target));
    }
}
