public class RemoveDuplicatesInPlace {
    public static int removeDuplicates(int[] nums){
        
        int j = 0;

        for(int i = 1;i<nums.length;i++){
        
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            } else {
                continue;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums= {2,3,3,5,8,8,10};
        System.out.println(removeDuplicates(nums));
    }
}
