import java.util.Map;
import java.util.HashSet;
public class FindDuplicateElement {
    public static int duplicateNumber(int[] nums){

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length; i++){

            if(set.contains(nums[i])){
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {3,5,5,9,11};
        System.out.println(duplicateNumber(nums));
    }
}
