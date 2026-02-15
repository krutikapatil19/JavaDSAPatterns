import java.util.Arrays;
public class ThreeSum {
    public static int[] findTriplets(int[] nums){

        Arrays.sort(nums);
        
        for(int i = 0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    return new int[] {nums[i], nums[j],nums[k]};
                }
                else if(sum>0){
                    k--;
                } else j++;
            }
        }
        return new int[] {-1,-1,-1};
    }
    public static void main(String[] args){
        int [] nums = {-8,-7,-4,3,6,11,14};
        System.out.println(Arrays.toString(findTriplets(nums)));
    }
}
