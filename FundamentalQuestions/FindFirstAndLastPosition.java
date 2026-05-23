import java.util.Arrays;
public class FindFirstAndLastPosition {

    //method to find first and last occurrence of target
    public static int[] searchRange(int[]nums , int target){

        //initially set both positions as -1
        int firstOccurence = -1;
        int lastOccurence = -1;

        //traverse the array
        for(int i = 0;i<nums.length; i++){

            //check if current element matches target
            if(nums[i] == target){

                //store first occurrence only once
                if(firstOccurence == -1){
                    firstOccurence = i;
                }

                //keep updating last occurence 
                lastOccurence = i;
            }
        }
        //store first and last occurrence in array
        int[] result = new int []{firstOccurence, lastOccurence};
        //return result array
        return result;
    }
    public static void main(String[] args){
        int[]nums ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
