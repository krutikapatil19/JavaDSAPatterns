import java.util.HashMap;
import java.util.Arrays;
public class prr {
    public static int[] TwoSumm(int[]nums, int target){

        int[] result = new int[2];
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){

                result[0] = map.get(complement);
                result[1] = i;
            } else {
                map.put(nums[i],i);
            }

        }
        return result;
    }
    public static void main(String args[]){
        int[]nums = {2,3,5,6,4,1};
        int target = 10;
        System.out.println(Arrays.toString(TwoSumm(nums, target)));
    }
}