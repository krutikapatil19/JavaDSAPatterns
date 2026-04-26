public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums){

        //Initialize two pointers - fast and slow pointer
        int slow = nums[0];
        int fast = nums[0];

        //Detect cycle - check where they meet
        do{
            slow = nums[slow];          //moves 1 step
            fast = nums[nums[fast]];    //move 2 steps
        } 
        while (slow != fast);
        //find entry point of cycle 
        slow = nums[0];

        while(slow != fast) {
            slow = nums[slow];      //move 1 step 
            fast = nums[fast];      //move 2 step
        }
        //duplicate number
        return slow;
    }
    public static void main(String[] args){
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}

//Floyd's Cycle Detection Approach used