import java.util.HashMap;
public class FruitsIntoBaskets {
    public static int countOfFruits(int[] fruits){

        int left = 0;       //start of window
        int maxFruits = 0;  //number of fruits

        //using HashMap to store Frequency or fruitCount
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right = 0; right<fruits.length;right++){
            int fruit = fruits[right];

            //Add fruit to window (increase count)
            map.put(fruit,map.getOrDefault(fruit,0) + 1);

            //Fix window if more than 2 types
            while(map.size()>2){
                int leftFruit = fruits[left];

            //decrease count of left fruit
            map.put(leftFruit, map.get(leftFruit)-1);

            //if count becomes 0 -> remove it
            if(map.get(leftFruit)==0){
                map.remove(leftFruit);
            }

            //move left pointer
            left++;
            }

            //Update max fruits in valid window
                maxFruits = Math.max(maxFruits, right -left+1);
        }
        return maxFruits;
    }
    public static void main(String[] args){
        int[] fruits = {1,2,3,2,2};
        System.out.println(countOfFruits(fruits));
    }
}
// We expand the window using right pointer
// Add fruit → shrink if >2 types → update max
// If more than 2 fruit types, shrink using left pointer
// Sliding window ensures optimal O(n) solution