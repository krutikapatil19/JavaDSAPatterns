public class SecondLargestNumberInArray{

    public static int findSecondLargest(int[] nums){

        int max = Integer.MIN_VALUE;        //variable to store largest number 
        int secondMax = Integer.MIN_VALUE;      //variable to store secondLargest number 

        //Loop through each element in array
        for(int i = 0;i<nums.length; i++){
        
            //If current element is greater than max, old max becomes SecondMax and max and max gets updated by current number
            if(nums[i]>max){
                secondMax = max;

                //update max with current element
                max = nums[i];

                //check if current element can become second Largest (if its lesser than max and greater than secondMax).
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