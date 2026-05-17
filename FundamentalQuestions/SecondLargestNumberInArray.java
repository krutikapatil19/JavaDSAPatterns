public class SecondLargestNumberInArray{

    public static int findSecondLargest(int[] nums){

        int max = Integer.MIN_VALUE;        //variable to store largest number 
        int secondMax = Integer.MIN_VALUE;      //variable to store secondLargest number 
        
        for(int i = 0;i<nums.length; i++){
        
            if(nums[i]>max){
                secondMax = max;
                max = nums[i];
            } else if(nums[i]<max && nums[i]>secondMax){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        int[] nums = {3,10,25,50,55};
        System.out.println((findSecondLargest(nums)));
    }
}