import java.util.HashMap;
public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[]nums, int k){

        //To store : Numbers - > Last index they were seen
        HashMap<Integer,Integer>map = new HashMap<>();

        //Traverse the array 
        for(int i = 0; i<nums.length; i++){

            //if the number was seen before
            if(map.containsKey(nums[i])){

                //Check if the distance is at most k 
                if(i-map.get(nums[i]) <= k){
                    return true;
                }
            }
            //update the latest index of the current number 
            map.put(nums[i],i);
        }
        //no valid fair found
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}

/*Approach : 
HashMap : Stores Number -> last occurence Index 
If the same number appears again , calculate the distance between previous Index when that number appeared and current Index when it appeared again ,using currentIndex - previousIndex.
If the distance <= k , return true , otherwise update the latest index.
*/