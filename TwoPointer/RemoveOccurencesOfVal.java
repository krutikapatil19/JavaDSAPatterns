public class RemoveOccurencesOfVal {
    public static int removeAllOccurences(int[] nums,int val){

        int j = 0;  //j keeps track of the elements which are not equal to given val.(i.e unique ones)

        for(int i = 0;i<nums.length;i++){   //i will iterate through the array, in order to find the elements!=val
            if(nums[i] != val){     //if current value is not equal to the val we want to remove
                nums[j] = nums[i];  //then keep it at j position
                j++;    // incrementing j, i.e expanding the unique elements space
            }
        }
        return j;  // returning j ,it basically represnts the count of unique numbers found so far.
    }
    public static void main(String[] args){
        int[] nums = {3,5,4,3,8,3,10};
        int val = 3;
        System.out.println(removeAllOccurences(nums,val));
    }
}
