import java.util.HashMap;
public class FruitsIntoBaskets {
    public static int countOfFruits(int[] fruits){

        int left = 0;
        int maxLength = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right = 0; right<fruits.length;right++){
            int fruit = fruits[right];

            map.put(fruit,map.getOrDefault(fruit,0) + 1);

            while(map.size()>2){
                int leftFruit = fruits[left];

            map.put(leftFruit, map.get(leftFruit)-1);

            if(map.get(leftFruit)==0){
                map.remove(leftFruit);
            }
                left++;
            }
            if(map.size() == 2){
                maxLength = Math.max(maxLength, right -left+1);
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] fruits = {1,2,3,2,2};
        System.out.println(countOfFruits(fruits));
    }
}
