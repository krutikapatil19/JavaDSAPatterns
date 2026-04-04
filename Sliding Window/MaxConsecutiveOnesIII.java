public class MaxConsecutiveOnesIII {
    public static int maximumOnes(int[] arr, int k){

        int left = 0;           //start of window
        int zeroesCount = 0;    //number of 0s in current window 
        int maxLen = 0;         //answer (max length found)

        //move right pointer
        for(int right = 0;right<arr.length;right++){

            //if current element is 0 → increase zero count
            if(arr[right] == 0) {
                zeroesCount++;
            }

            //if window becomes invalid (more than k zeroes)
            while(zeroesCount >k) {

                //if left element is 0 -> reduce zero count
                if(arr[left] ==0) {
                    zeroesCount--;
                }

                //shrink window 
                left++;
            }
            //update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maximumOnes(arr,k));
    }
}
