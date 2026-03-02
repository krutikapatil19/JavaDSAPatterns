import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum {
    public static List<List<Integer>> findTriplets(int[] nums){

        //Sorting the array , so two pointers can be used.
        Arrays.sort(nums);

        //This will store all valid Triplets 
        List<List<Integer>> result = new ArrayList<>();
        
        //Fix one element at a time
        for(int i = 0;i<nums.length-2;i++){

            //Skip duplicate values for i
            if (i>0){if(nums[i] == nums[i-1]){
                continue;
            }
        }
            //Two pointers 
            int j = i+1;    //next element after i
            int k = nums.length-1;  //last element

            //Find pair such that pair sum becomes 0
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];

                if(sum == 0){
                //If sum is 0 , store the Triplet
                 result.add(Arrays.asList(nums[i],nums[j],nums[k])) ;

                 //Move both pointers
                 j++;
                 k--;
                
                //Skip duplicate values for j
                while(j < k && nums[j] == nums[j-1]) j++;
                //Skip duplicate values for k
                while(k > j && nums[k] == nums[k+1]) k--; 
                
                }
                //If sum is too big , decrease k (towards left)
                else if(sum>0){
                    k--;
                } else j++; //else move j towards right , so that sum value can increase

            }
        }
        return result;
    }
    public static void main(String[] args){
        int [] nums = {-8,-7,-4,3,6,11,15};
        System.out.println(findTriplets(nums));
    }
}
