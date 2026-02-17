public class RemoveDuplicatesInPlace {
    public static int removeDuplicates(int[] nums){
        
        //j will point to the position of the last unique element
        int j = 0;

        for(int i = 1;i<nums.length;i++){
        
            //If current element is different from last unique element
            if(nums[i] != nums[j]){

                //Move j forward(expand unique section)
                j++;

                //copy the new unique element at position j
                nums[j] = nums[i];
            }
        }
        //return total number of unique elements
        return j+1;
    }
    public static void main(String[] args){
        int[] nums= {2,3,3,5,8,8,8,10};
        System.out.println(removeDuplicates(nums));
    }
}
