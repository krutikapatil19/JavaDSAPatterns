import java.util.Arrays;
public class RemoveOccurencesOfVal {
    public static int removeAllOccurences(int[] nums,int val){

        int j = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {3,5,4,3,8,3,10};
        int val = 3;
        System.out.println(removeAllOccurences(nums,val));
    }
}
