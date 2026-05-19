import java.util.Scanner;
public class removeDuplicatesInputFromUser{
    public static int removeDuplicates(int[] nums){

        //Used two pointers in this , i for traversal , and j to point where the next unique element goes 
        int i = 1;  
        int j = 0;  //points to whre the next unique element should go 

        for( i = 1;i<nums.length; i++){
            if(nums[i]!= nums[j]){          //checks if adjacent numbers are not equal , if unique then stored at j+1 position
               nums[j+1] = nums[i];
               j++;
            }
        }
        return j+1;     //j+1 represent the count of unique elements 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println((removeDuplicates(nums)));
    }
}
 