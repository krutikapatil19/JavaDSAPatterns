import java.util.Arrays;
public class TwoSum {
    public static int[] twoSumTarget(int[] nums,int k) {
        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int sum = nums[i] + nums[j];
            if(sum == k){
                return new int[] {nums[i],nums[j]};
            } 
            else if (sum > k){
                j--;
            } else i++;
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args){
        int[] nums = {2,10,12,15,20};
        int k = 31;
        System.out.println(Arrays.toString(twoSumTarget(nums,k)));
    }
}