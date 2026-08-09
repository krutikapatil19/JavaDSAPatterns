public class SearchInRotatedSortedArray {
    public static int searchIndexOfTarget(int[]nums, int target){

        int ans = -1;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                ans = mid;
            } else if (nums[left]<=nums[mid]){
                //it means the left half is sorted
                right =mid-1;
            } else {
                //else ,the right half is sorted 
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
