import java.util.Arrays;
public class SquaresOfSortedArray {
    public static int[] findSquares(int[] nums){

        int i = 0;
        int j = nums.length-1;

        int[] result = new int[nums.length];
        int k = result.length-1;

        while(i<=j){

            //Calculate squares of both ends

            int squareLeft = nums[i] * nums[i];
            int squareRight = nums[j] * nums[j];

            //compare both the squares, and place the bigger one at the end of the result

            if(squareLeft< squareRight){
                result[k] = squareRight;
                j--;
                k--;
            } else {
                result[k] = squareLeft;
                i++;
                k--;
            }
        }
        return result;
        }
        public static void main(String[] args){
            int[] nums = {-6,-3,1,2,4,5};
            System.out.println(Arrays.toString(findSquares(nums)));
        }
    }

