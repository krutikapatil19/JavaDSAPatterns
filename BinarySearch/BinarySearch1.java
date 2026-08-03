public class BinarySearch1{

    public static int searchElement(int[]nums, int k){

        int left=0;
        int right = nums.length-1;
    
        while(left<=right){

            int mid = (left+right)/2;
            if(nums[mid]==k){
                return mid;
            }else if (k>nums[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]nums = {2,3,8,12,15,21,50};
        int k = 12;
        System.out.println(searchElement(nums,k));
    }
}