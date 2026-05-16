import java.util.HashSet;
public class FindDuplicateElement {
    public static HashSet<Integer> duplicateNumber(int[] nums){

        //Set to store already seen elements
        HashSet<Integer> set = new HashSet<>();

        //Set to store duplicate elements 
        HashSet<Integer> duplicates = new HashSet<>();
        
        //Loop through each element in array 
        for(int i = 0;i<nums.length; i++){

            //If element already exists in set , then it is duplicate
            if(set.contains(nums[i])){

                //add duplicate element into duplicates set
                duplicates.add(nums[i]);
            } else {

                //if number is not present, add it into set
                set.add(nums[i]);
            }
        }
        return duplicates;  //return all duplicates 
    }
    public static void main(String[] args){
        int[] nums = {3,5,9,9,3,11};
        System.out.println(duplicateNumber(nums));
    }
}
