public class FindFloorAndCeiling {
    public static int floorAndCeilingOfANumber(int[]nums, int k){

        int left = 0;
        int right = nums.length-1;
        int result=-1;
    
            while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]<=k){
               result = nums[mid];
                left=mid+1;
            } else {
                right = mid-1;
            }
        }
        return result;
    }

    //Method to find ceiling
    public static int findCeiling(int[]nums, int k){

        int left = 0;
        int right = nums.length-1;
        int result = -1;

        while(left<=right){

        int mid = (left+right)/2;

            if(nums[mid]>=k){
                result = nums[mid];
                right = mid-1;
            } else {
                left= mid+1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 8, 10, 10, 12, 19};
        int k = 5;
        int floor = floorAndCeilingOfANumber(nums,k);
        int ceiling = findCeiling(nums, k);
        System.out.println("Floor: " + floor + " Ceiling: "+ ceiling);
    }
}
