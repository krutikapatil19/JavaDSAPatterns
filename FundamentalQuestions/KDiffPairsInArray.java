import java.util.HashMap;
import java.util.HashSet;

public class KDiffPairsInArray {
    public static int findKDiffPairs(int[]nums , int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<String> pairs = new HashSet<>();
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int complement = nums[i]-target;

            if(map.containsKey(complement)){

                int smaller = Math.min(nums[i],complement);
                int larger = Math.max(nums[i],complement);

                String pair = smaller + "," +  larger;
                if(!pairs.contains(pair)){
                pairs.add(pair);
                count++;
}
            }else if(map.containsKey(nums[i]+target)){

                int smaller = Math.min(nums[i], nums[i] + target);
                int larger = Math.max(nums[i],complement);

                String pair = smaller + "," + larger;
                if(!pairs.contains(pair)){
                    pairs.add(pair);
                    count++;
                }
            }
                else {
                map.put(nums[i],i);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {4,6,7};
        int target = 2;
        System.out.println(findKDiffPairs(nums,target));
    }
}
