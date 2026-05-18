public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){

        //Used two pointers in this , i for traversal , and j to point where the next unique element goes 
        int i = 1;  
        int j = 0;  //points to whre the next unique element should go 

        for( i = 1;i<nums.length; i++){
            if(nums[i]!= nums[j]){          //checks if adjacent numbers are not equal , if unique then stored at j+1 position
               nums[j+1] = nums[i];
               j++;
            }
        }
        return j+1;     //j+1 represent the count of unique elements 
    }
    public static void main(String[] args){
        int[] nums = {2,5,5,10,12,12};
        System.out.println((removeDuplicates(nums)));
    }
}
