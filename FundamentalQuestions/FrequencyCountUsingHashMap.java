import java.util.HashMap;
import java.util.Map;
public class FrequencyCountUsingHashMap {
    public static Map<Integer, Integer> countFrequency(int[] nums){

        Map<Integer, Integer> freqCount = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(freqCount.containsKey(nums[i])){
                freqCount.put(nums[i], freqCount.get(nums[i]) + 1);
            } else {
                freqCount.put(nums[i], 1);
            }
        }
        return freqCount;
    }
    public static void main(String[] args){
        int[] nums = {2,10,3,2,5,2,5};
        System.out.println(countFrequency(nums));
    }
}