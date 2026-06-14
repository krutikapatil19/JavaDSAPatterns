import java.util.HashMap;
public class KDiffPairsInArray {
    public static int findKDiffPairs(int[]nums , int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            //int j = i+1;
            int complement = nums[i]+target;

            if(map.containsKey(complement)){
                count++;
            }else {
                map.put(nums[i],i);
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {3,4,5,8};
        int target = 1;
        System.out.println(findKDiffPairs(nums,target));
    }
}
