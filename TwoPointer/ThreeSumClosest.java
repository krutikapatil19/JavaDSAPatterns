import java.util.Arrays;
public class ThreeSumClosest {
    public static int FindClosestDifference(int[] nums,int target){
        
        Arrays.sort(nums);
        int bestClosestSum = nums[0] + nums[1] + nums[2];

        for(int i = 0;i<nums.length-2;i++){
        
        int j = i+1;
        int k = nums.length-1;

        while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum==target){
                return sum;
            }

            if(Math.abs(sum-target) < Math.abs(bestClosestSum-target)){
                bestClosestSum = sum;
            }
            
            if(sum>target){
                k--;
            } else j++;
        }
    }
        return bestClosestSum;
    }
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target = 2;
        System.out.println(FindClosestDifference(nums,target));
    }
}
