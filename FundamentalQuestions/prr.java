import java.util.HashMap;
public class prr{
    public static boolean twoSum(int[]nums,int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length; i++){

           int complement = target - nums[i];
            if(map.containsKey(complement)){
                return true;
            } 
            else map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        int[]nums = {3,10,12,14,20};
        int target = 26;
        System.out.println(twoSum(nums,target));
    }
}