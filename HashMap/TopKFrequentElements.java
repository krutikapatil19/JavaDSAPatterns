package HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class TopKFrequentElements {
    public static int[] topFrequentElements(int[]nums,int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[k];

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){

                //Take the old frequency , and 1 , and store it back
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                //store this number with frequency 1
                map.put(nums[i],1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
            //Map.entry<Integer,Integer> -> one key value pair of the HashMap
            
            /*for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int number = entry.getKey();
                int frequency = entry.getValue();
            }
                */
        return result;
    }
    public static void main(String[] args){
        int[]nums = {1,1,1,2,2,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topFrequentElements(nums,k)));
    }
}
