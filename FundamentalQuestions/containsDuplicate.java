import java.util.HashSet;
public class containsDuplicate {
    public static boolean isDuplicate(int[]nums){

        HashSet<Integer> set = new HashSet<>();

            for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,3,1,5};
        System.out.println(isDuplicate(nums));
    }
}
