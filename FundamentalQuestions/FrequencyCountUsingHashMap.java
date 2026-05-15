import java.util.HashMap;
import java.util.Map;
public class FrequencyCountUsingHashMap {

    //Function to count frequency of elements in an array 
    public static Map<Integer, Integer> countFrequency(int[] nums){

        //creating a new HashMap object named freqCount , which stores key-value pairs.
        Map<Integer, Integer> freqCount = new HashMap<>();

        //Loop through each element in array (we can also use modified for loop)
        for(int i = 0; i<nums.length; i++){

            //if number already exists, increase count by 1 , or put 1
            freqCount.put(nums[i], freqCount.getOrDefault(nums[i], 0) + 1);
        }
        return freqCount;
    }
    public static void main(String[] args){
        int[] nums = {2,10,3,2,5,2,5};
        System.out.println(countFrequency(nums));
    }
}