import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum {
    public static List<List<Integer>> findTriplets(int[] nums){

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0;i<nums.length-2;i++){

            if (i>0){if(nums[i] == nums[i-1]){
                continue;
            }
        }
            int j = i+1;
            int k = nums.length-1;

            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                 result.add(Arrays.asList(nums[i],nums[j],nums[k])) ;
                 j++;
                 k--;
                

                while(j < k && nums[j] == nums[j-1]) j++;
                while(k > j && nums[k] == nums[k+1]) k--; 
                
                }
                else if(sum>0){
                    k--;
                } else j++;

            }
        }
        return result;
    }
    public static void main(String[] args){
        int [] nums = {-8,-7,-4,3,6,11,15};
        System.out.println(findTriplets(nums));
    }
}
