import java.util.Arrays;
public class SquaresOfSortedArray {
    public static int[] findSquares(int[] nums){

        int i = 0; //i starts from beginning 
        int j = nums.length-1; //j starts from end

        int[] result = new int[nums.length]; //new array to store the sorted squares 
        int k = result.length-1; //k fills the array from the end 

        while(i<=j){ //loop until both the pointers meet 

            //Calculate squares of both ends
            int squareLeft = nums[i] * nums[i];
            int squareRight = nums[j] * nums[j];

            //compare both the squares, and place the bigger one at the end of the result
            if(squareLeft< squareRight){
                result[k] = squareRight;  //put right square
                j--;  //move right pointer
                k--;  //decrease k (to the left side)
            } else {
                result[k] = squareLeft; //if left square is greater than the right square , put it at the kth position
                i++;  //move left pointer 
                k--;  //move k towards left 
            }
        }
        return result;
        }
        public static void main(String[] args){
            int[] nums = {-6,-3,1,2,4,5};
            System.out.println(Arrays.toString(findSquares(nums)));
        }
    }

