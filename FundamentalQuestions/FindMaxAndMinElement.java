import java.util.Arrays;
public class FindMaxAndMinElement {
    public static int[] findMaxMinElement(int[] nums){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length; i++){
            if(nums[i]<min){                    //if current number is lesser than min, then update min 
                min = nums[i];
            } 
            if(nums[i]>max){                    //if current number is greater than max , then update max
                max = nums[i];
            }
        }

        int[] maxAndMin = {max,min};            //an array to store max and min element 
       return maxAndMin;
    }
    public static void main(String[] args){
        int[] nums = {2,10,12,20,190};
        int[] answer = findMaxMinElement(nums);
        System.out.println("Maximum = " + answer[0] + " and " + "Minimum = "  + answer[1]);
    }
}
