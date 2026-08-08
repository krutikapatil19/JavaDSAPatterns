public class FindFloorAndCeil {
    public static int[] floorAndCeilOfANumber(int[]nums, int k){

        int left = 0;
        int right = nums.length-1;

        int result;
        
            int mid = (left+right)/2;

            while(left<=right){
            if(nums[mid]<=k){
               result = nums[mid];
                left=mid+1;
            } else {
                right = mid-1;
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        System.out.println(floorAndCeilOfANumber(nums,k));
    }
}
