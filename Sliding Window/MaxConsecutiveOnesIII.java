public class MaxConsecutiveOnesIII {
    public static int maximumOnes(int[] arr, int k){

        int left = 0;
        int zeroesCount = 0;
        int maxLen = 0;

        for(int right = 0;right<arr.length;right++){
            //if current element is 0 → zeroesCount++
           
            if(arr[right] == 0) {
                zeroesCount++;
            }

            if(zeroesCount >k) {
                if(arr[left] ==0) {
                    zeroesCount--;
                    left++;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maximumOnes(arr,k));
    }
}
