import java.util.Arrays;
import java.util.HashSet;
public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequencee(int[]nums){

        //edge case
        if(nums.length == 0){
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        //variables 
        int currentLength = 1;
        int maxLength = 1;

        int current = 1;

        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);

            if(!set.contains(nums[i]-1)){
                current = nums[i];
                currentLength = 1;
            }
        //while the next consecutive number exists in HashSet, keep moving forward.
        while(set.contains(current+1)){
            current = current+1;
            currentLength++;
        }
        if(currentLength > maxLength){
            maxLength = currentLength;
        }
    }
        return maxLength;
    }
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSequencee(nums));
    }
}