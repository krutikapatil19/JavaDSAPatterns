import java.util.Arrays;
public class ThreeSumClosest {
    public static int FindClosestDifference(int[] nums,int target){
        int closestSum = 0;

        Arrays.sort(nums);

        for(int i = 0;i<nums.length-2;i++){
        int j = i+1;
        int k = nums.length-1;

        while(j<k){
            
            int sum = nums[i]+nums[j]+nums[k];
            if(sum>target){
                k--;
            } else j++;
        }
    }
        return closestSum;
    }
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(FindClosestDifference(nums,target));
    }
}
