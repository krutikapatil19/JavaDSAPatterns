import java.util.HashMap;
public class containsDuplicate {
    public static boolean isDuplicate(int[]nums){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            } else {
                map.put(nums[i],i);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,3,1,5};
        System.out.println(isDuplicate(nums));
    }
}
