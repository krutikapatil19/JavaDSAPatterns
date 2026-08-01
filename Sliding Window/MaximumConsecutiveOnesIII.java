public class MaximumConsecutiveOnesIII {
    public static int maximumOnes(int[] arr, int k){

        int left = 0;           
        int zeroesCount = 0;    
        int maxLen = 0;         

        //move right pointer
        for(int right = 0;right<arr.length;right++){

            //if current element is 0 → increase zero count
            if(arr[right] == 0) {
                zeroesCount++;
            }

            while(zeroesCount >k) {

                //if left element is 0 -> reduce zero count
                if(arr[left] ==0) {
                    zeroesCount--;
                }

                left++;
            }
            
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
