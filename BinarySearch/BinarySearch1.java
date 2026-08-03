public class BinarySearch1{

    public static int searchElement(int[]nums, int k){

        int left=0;
        int right = nums.length-1;
        int mid= (left+right)/2;

        while(left<right){
            if(nums[mid]==k){
                return mid;
            }else if (k>mid){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[]nums = {2,3,8,12};
        int k = 3;
        System.out.println(searchElement(nums,k));
    }
}