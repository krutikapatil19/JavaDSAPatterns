public class searchRange {


    public static int[] findSearchRange(int[]nums, int k){
        int[] result = new int[2];

        result[0] = findBound(nums, k, true);       //isSearchingLeft(true) -> looking for leftmost
        result[1] = findBound(nums, k, false);      //false -> looking for rightmost occurence

        return result;
    }

    public static int findBound(int[]nums, int target, boolean isSearchingLeft){

        int left = 0;
        int right = nums.length-1;
        int result = -1;        //for the case , where target is never found 

        while(left<=right){
            //main logic
            int mid = (left+right)/2;

            if(nums[mid]>target){
                right = mid-1;
            }
            else if (nums[mid]<target){
                left=mid+1;
            } else {
                result = mid;   //save this match

                if(isSearchingLeft) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return -1;
    }
        
    public static void main(String[]args){
        int[]nums = {5,7,7,8,8,8,10};
        int k = 8;
        System.out.println(findSearchRange(nums,k));
    }
}
