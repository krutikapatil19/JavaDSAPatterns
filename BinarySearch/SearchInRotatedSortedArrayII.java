public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = (left+right)/2;

            //edge case
            if(nums[left] == nums[mid] && nums[mid]==nums[right]){
                left++;
                right--;
            }
            if(nums[mid]==target){
                return true;
            }

            //when left half is sorted 
            if(nums[left]<=nums[mid]){
                        
                if(nums[left]<=target && target<=nums[mid]){
                    //target is inside the sorted left half
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }else {
                //right half is sorted 
                if(nums[mid]<=target && target<=nums[right]){
                    left = mid+1;
                }else {
                    right = mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));

    }
}
