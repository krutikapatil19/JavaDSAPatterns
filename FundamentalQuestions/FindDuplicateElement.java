import java.util.HashSet;
public class FindDuplicateElement {
    public static HashSet<Integer> duplicateNumber(int[] nums){

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> duplicates = new HashSet<>();
        
        for(int i = 0;i<nums.length; i++){

            if(set.contains(nums[i])){
                duplicates.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return duplicates;
    }
    public static void main(String[] args){
        int[] nums = {3,5,9,9,11};
        System.out.println(duplicateNumber(nums));
    }
}
