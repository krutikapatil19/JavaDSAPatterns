import java.util.HashMap;
import java.util.HashSet;

public class KDiffPairsInArray {
    public static int findKDiffPairs(int[]nums , int target){

        //store visited numbers and their indices
        HashMap<Integer,Integer> map = new HashMap<>();
        //Store unique pairs(it avoids dupplicate counting)
        HashSet<String> pairs = new HashSet<>();

        // Stores final count of unique pairs havig k difference
        int count = 0;

        for(int i = 0; i<nums.length; i++){

            //Find number whose difference with current element is k
            int complement = nums[i]-target;

            //Check if smaller number already exists
            if(map.containsKey(complement)){

                int smaller = Math.min(nums[i],complement);
                int larger = Math.max(nums[i],complement);

                String pair = smaller + "," +  larger;

                // Count only if pair is not counted before
                if(!pairs.contains(pair)){
                pairs.add(pair);
                count++;
}
            }else if(map.containsKey(nums[i]+target)){

                int smaller = Math.min(nums[i], nums[i] + target);
                int larger = Math.max(nums[i], nums[i]+target);

                String pair = smaller + "," + larger;

                // Count only if pair is not counted before
                if(!pairs.contains(pair)){
                    pairs.add(pair);
                    count++;
                }
            }

            //Store current number for future elements
                map.put(nums[i],i);
        }
        
        return count;
    }
    public static void main(String[] args){
        int[] nums = {4,6,7,9};
        int target = 2;
        System.out.println(findKDiffPairs(nums,target));
    }
}
