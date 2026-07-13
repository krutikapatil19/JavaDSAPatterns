import java.util.HashMap;
public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[]nums, int k){

        int previousIndex ;
        int currentIndex;

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i]) == k){
                    return true;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
