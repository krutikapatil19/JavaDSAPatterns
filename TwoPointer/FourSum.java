import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums,int target){

        //Sorting the array, so the two pointers can be used.
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        //Fixing one element at a time
        for(int i = 0;i<nums.length-3;i++){
            if(i>0 && nums[i]== nums[i-1]) continue;

            for(int j = i+1; j < nums.length-2; j++){
            
            int k = j+1;
            int l = nums.length -1;
        
        while(k<l){
            int sum = nums[i]+nums[j]+nums[k]+ nums[l];

            if(sum == target){
                result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));

                k++;
                l--;

                while(k <l && nums[k] == nums[k-1]) k++;

                while(l> k && nums[l] == nums[l+1]) l--;

            } else if (sum >target) {
                l--;
            } else {
                k++;
            }
        }
    }
}
    return result;
}
    public static void main(String[] args){
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
    }
}

