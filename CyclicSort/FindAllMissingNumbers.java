import java.util.ArrayList;
import java.util.List;
public class FindAllMissingNumbers {
    public static List<Integer> findMissingNumbers(int[] nums){
        int i = 0;

        //list to store missing numbers
        List<Integer> result = new ArrayList<>();

        //Place every number at its correct index
        while(i<nums.length){

            // correct index for current number
            int correctIndex = nums[i] -1 ;

            //if number is not at correct position, swap it
            if(nums[i] != nums[correctIndex]) {
                //swap

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                //if already correct, move to next index
                i++;
            }
        }

        //find all missing numbers
            for(int j = 0; j<nums.length; j++){

                //if index and value do not match, number is missing
                if(nums[j] != j+1){
                    result.add(j+1);
                }
            }
        //return list of missing numbers
        return result;
    }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.print(findMissingNumbers(nums));
    }
}


//cyclic sort approach 