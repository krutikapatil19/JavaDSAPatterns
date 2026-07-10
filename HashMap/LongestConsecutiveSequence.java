import java.util.HashSet;
public class LongestConsecutiveSequence {

    //function to find the length of the longest consecutive sequence
    public static int longestConsecutiveSequencee(int[]nums){

        //edge case: if array is empty , the answer is 0 
        if(nums.length == 0){
            return 0;
        }
        
        //stores all numbers for fast lookup 
        HashSet<Integer> set = new HashSet<>();
        
        //how many numbers counted so far (length of current sequence)
        int currentLength = 1;

        //stores the maximum sequence length
        int maxLength = 1;

        //the number currently pointed at
        int current;

        //add all array elements into the HashSet
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        //Traverse every number in the array
        for (int num: set){

            //check if current number is the start of a sequence
            if(!set.contains(num-1)){

                //start counting from this number
                current = num;
                currentLength = 1;

        //while the next consecutive number exists in HashSet, Keep moving forward.
        while(set.contains(current+1)){
            current++;
            currentLength++;
        }

        //update the longest sequence found so far
        if(currentLength > maxLength){
        maxLength = currentLength;
        }
    }
}
        //return the final count 
        return maxLength;
    }

    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSequencee(nums));
    }
}

/*Pattern: HashSet + Sequence Detection

1. Store all numbers in a HashSet.
2.Visit every number.
3.If previous number doesn't exist -> start a new sequence.
4.keep checking next numbers using HashSet.
5.Update the maximum sequence length.

Trick :
If previous number exists -> skip the current one (as sequence has already started).
If previous number absent -> starts new sequence.
*/