public class SubarraySumEqualsK {
    public static int subarrayCount(int[] nums, int k){

    int count = 0;

    for(int i = 0; i<nums.length; i++){

        int sum = 0;

        for(int j = i; j<nums.length; j++){

                sum += nums[j];

                if(sum == k){
                    count++;
                }
            }
        }
    return count;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,-3,1,1,1};
        int k = 3;
        System.out.println(subarrayCount(nums,k));
    }
}
