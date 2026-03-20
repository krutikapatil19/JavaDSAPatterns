public class FindDuplicateNumber {
    public static int findDuplicate(int[]nums){

        //Initialize pointers
        int slow = nums[0];
        int fast = nums[0];

        //detect cycle (do-while , so it runs atleast once)
        do {
            slow = nums[slow];          //move one step
            fast = nums[nums[fast]];    //move two steps
        }
        while(slow != fast );
        
        //reset one pointer to start
        slow = nums[0];

        //move both 1 step until they meet
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
            return slow;
        }
       
public static void main(String[] args){
    int[] nums = {1,3,4,2,2};
    System.out.println(findDuplicate(nums));
}
}
