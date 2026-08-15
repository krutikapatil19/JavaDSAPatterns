public class MinimumInRotatedSortedArrayy {
    public static int findMinimum(int[]nums){

        int left = 0;
        int right = nums.length-1;
        int ans;

        while(left<right){
            
            int mid = (left+right)/2;

            if(nums[mid]<nums[right]){
                
                //right half is sorted 
                //it means the minimum is either the mid element or its to the left of mid.
                right = mid;
            }
        }
    return ans;
    }
    public static void main(String[] args){
        int[]nums = {3,4,5,1,2};
        System.out.println(findMinimum(nums));
    }
}
