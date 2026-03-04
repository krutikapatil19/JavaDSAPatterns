import java.util.Arrays;
public class TripletsWithSmallerSum {
    public static int findTriplets(int[] nums, int sum){

        //Sort the array , so that two-pointers can be used 
        Arrays.sort(nums);

        int count = 0;  //this will store total number of valid triplets
    
        //Fix one element at a time 
        for(int i = 0;i<nums.length-2;i++){
            int j = i+1;        //next element after i
            int k = nums.length-1;  //last element

            //Using two pointer j and k
            while(j<k){
                int currentSum = nums[i]+nums[j]+nums[k];
                if(currentSum < sum){       //if sum is smaller than target

                    //All elements between j and k will also form valid triplets 
                    count += (k-j);
                    j++;        //Move j forward to check new combinations 
                 
                } 
                else{
                    //If sum is too large , reduce it 
                    k--;
            }
        }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {-2,0,1,3};
        int sum = 3;
        System.out.println(findTriplets(nums,sum));
    }
}