import java.util.List;
import java.util.ArrayList;
public class FindAllDuplicates {
    public static List<Integer> findingAllDuplicates(int[] nums){

        int i = 0;

        List<Integer> result = new ArrayList<>();

        while(i < nums.length){

            int correctIndex = nums[i] - 1;
            
            if(nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                 if(i != correctIndex){
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

