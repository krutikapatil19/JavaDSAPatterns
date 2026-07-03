package HashMap;
import java.util.HashMap;

public class TopKFrequentElements {
    public static int[] topFrequentElements(int[]nums,int k){

        HashMap<Integer,Integer> map = new HashMap<>();
    }
    public static void main(String[] args){
        int[]nums = {1,1,1,2,2,2,2,3};
        int k = 2;
        System.out.println(topFrequentElements(nums,k));
    }
}
