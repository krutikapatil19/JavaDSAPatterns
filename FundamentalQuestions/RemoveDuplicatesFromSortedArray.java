import java.util.Arrays;
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){

        int i = 1;  
        int j = 0;  //points to whre the next unique element should go 
        for( i = 1;i<nums.length; i++){
            if(nums[i]!= nums[j]){
               nums[j+1] = nums[i];
               j++;
            }
        }
        return j+1; 
    }
    public static void main(String[] args){
        int[] nums = {2,5,5,10,12,12};
        System.out.println((removeDuplicates(nums)));
    }
}
