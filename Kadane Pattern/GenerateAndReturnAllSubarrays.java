import java.util.ArrayList;
import java.util.List;
public class GenerateAndReturnAllSubarrays {
    public static List<List<Integer>> returnAllSubarrays(int[] nums){

        List<List<Integer>> result = new ArrayList<>();

        for(int i =0;i<nums.length;i++ ){

            for(int j = i; j<nums.length;j++){

                List<Integer> sub = new ArrayList<>();
                
                for(int k = i; k<=j; k++){
                sub.add(nums[k]);
            }
        }
    }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.println(returnAllSubarrays(nums));
    }
}
