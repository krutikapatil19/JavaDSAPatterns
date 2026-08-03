public class InsertSearchPosition {
    public static int searchInsert(int[]nums,int target){

        int left = 0;                   //starting index
        int right = nums.length-1;      //ending index

        while(left<=right){             //keep searching while range is valid 

            //calculate middle element of current range 
            int mid = (left+right)/2;

            if(nums[mid]==target){

                //if target is found, return its index immediately
                return mid;
            } else if(nums[mid]>target){
                right = mid-1;
            }else{
                left=mid+1;
            } 
        }
        //loop ends when left > right(target not found in array)
        //at this point, "left" has naturally moved to its correct insert position.
        return left;
    }
    public static void main(String[]args){
        int[]nums = {1,3,4,5,6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }
}
