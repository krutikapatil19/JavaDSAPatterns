import java.util.Arrays;
public class ThreeSumClosest {
    public static int FindClosestDifference(int[] nums,int target){
        
        //Sorting the array first, so that two pointers can be used
        Arrays.sort(nums);
        int bestClosestSum = nums[0] + nums[1] + nums[2];       //assume the first three numbers sum is closest to target

        //Fix one number at a time
        for(int i = 0;i<nums.length-2;i++){
        
        //Two pointers,j start at after i and k starts at the end    
        int j = i+1;
        int k = nums.length-1;

        //Move two pointers towards each other
        while(j<k){

            //Calculate current triplet sum 
            int sum = nums[i]+nums[j]+nums[k];

            //if exact target is found , then return immediately
            if(sum==target){
                return sum;
            }
            //check if current sum is closer to target
            //compare distance from target
            if(Math.abs(sum-target) < Math.abs(bestClosestSum-target)){
                bestClosestSum = sum;               //update best answer
            }
            
            //move pointers based on sum is greater or smaller than the target
            if(sum>target){
                k--;        //need smaller sum
            } else j++;     //need bigger sum
        }
    }
        return bestClosestSum;  //return the closestbestsum found
    }
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        int target = 2;
        System.out.println(FindClosestDifference(nums,target));
    }
}
