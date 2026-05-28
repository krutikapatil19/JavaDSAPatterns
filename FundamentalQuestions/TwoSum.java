import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {

    //Function to find indices of two numbers whose sum equals target
    public static int[] findNumbers(int[]nums, int target){

        //HashMap to store number and its index
        HashMap <Integer,Integer> map = new HashMap<>();

        //Loop through each element in array
        for(int i = 0;i<nums.length; i++){

            //Find number needed to reach target
            int complement = target - nums[i];

            //Check if complement already exists in map
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
        
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        System.out.println(Arrays.toString(findNumbers(nums, target)));
    }
}
