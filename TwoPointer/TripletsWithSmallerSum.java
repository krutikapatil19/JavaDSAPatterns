import java.util.Arrays;
public class TripletsWithSmallerSum {
    public static int findTriplets(int[] nums, int sum){

        Arrays.sort(nums);
        int count = 0;
    
        for(int i = 0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int currentSum = nums[i]+nums[j]+nums[k];
                if(currentSum < sum){
                    count += (k-j);
                    j++;
                 
                } 
                else
                    k--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {-2,0,1,3};
        int sum = 3;
        System.out.println(findTriplets(nums,sum));
    }
}