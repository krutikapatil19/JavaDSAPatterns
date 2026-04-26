public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args){
        int[] nums = {2,3,3,4,6};
        System.out.println(findDuplicate(nums));
    }
}