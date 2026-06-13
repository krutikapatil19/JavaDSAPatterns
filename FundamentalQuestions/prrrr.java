import java.util.HashMap;
public class prrrr {
    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = {};
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                
            } else {
                map.put(nums[i],i);
            }
            result = {i, nums[complement]};
        }
        return  result;
    }
    public static void main(String[] args){
        int[] nums = {2,3,8,9,13};
        int target = 20;
        System.out.println(twoSum(nums, target));
    }
}
