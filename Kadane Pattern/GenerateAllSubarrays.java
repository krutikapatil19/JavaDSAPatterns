public class GenerateAllSubarrays {
    public static void allSubarraysOfAnArray (int[] nums){

        for(int i = 0;i<nums.length; i++){          //i-> indicates start of subarray
            for(int j = i; j<nums.length; j++){     //j-> end of subarray
                 
                for(int k = i; k<=j; k++){          //k -> traversal between i and j
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        allSubarraysOfAnArray(nums);
    }
}