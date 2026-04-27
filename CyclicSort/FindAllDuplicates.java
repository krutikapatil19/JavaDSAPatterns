import java.util.List;
import java.util.ArrayList;
public class FindAllDuplicates {
    public static List<Integer> findingAllDuplicates(int[] nums){

        int i = 0;

        //list to store duplicate numbers
        List<Integer> result = new ArrayList<>();

        //place every number at its correct index 
        while(i < nums.length){

            //correct index for current number
            int correctIndex = nums[i] - 1;
            
            //if number is not at correct position , swap it
            if(nums[i] != nums[correctIndex]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {

                //if number is already at correct position
                //but index is different → duplicate found
                 if(i != correctIndex && !result.contains(nums[i])){
                  result.add(nums[i]);
            }
                i++;
            }
        }
            return result;
        }
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findingAllDuplicates(nums));
    }
}

