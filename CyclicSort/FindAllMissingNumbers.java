import java.util.ArrayList;
import java.util.List;
public class FindAllMissingNumbers {
    public static List<Integer> sortingArray(int[] nums){
        int i = 0;

        List<Integer> result = new ArrayList<>();
        while(i<nums.length){
            int correctIndex = nums[i] -1 ;

            if(nums[i] != nums[correctIndex]) {
                //swap

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }

            for(int j = 0; j<nums.length; j++){
                if(nums[j] != j+1){
                    result.add(j+1);
                }
            
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.print(sortingArray(nums));
    }
}


//cyclic sort approach 