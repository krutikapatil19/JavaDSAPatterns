public class LongestConsecutiveSequence {
    public static int longestConsecutiveSequencee(int[]nums){

        //edge case
        //sort the array
        Arrays.sort(nums);

        //variables 
        int currentLength = 0;
        int maxLength = 0;

        for(int i = 1; i<nums.length; i++){
            //check if consecutive
            if(nums[i]==nums[i-1]+1){
                currentLength++;

                if(currentLength>maxLength){
                    maxLength = currentLength;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSequencee(nums));
    }
}