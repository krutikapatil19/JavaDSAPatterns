import java.util.Arrays;
public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequencee(int[]nums){

        //edge case
        if(nums.length == 0){
            return 0;
        }
        
        //sort the array
        Arrays.sort(nums);

        //variables 
        int currentLength = 1;
        int maxLength = 1;

        for(int i = 1; i<nums.length; i++){
            //check if consecutive
            if(nums[i]==nums[i-1]+1){
                currentLength++;

                if(currentLength>maxLength){
                    maxLength = currentLength;
                }
            } 
            //if the adjacent numbers are duplicate:
            else if(nums[i]==nums[i-1]){
                //do nothing (ignore the duplicate)
            }else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSequencee(nums));
    }
}