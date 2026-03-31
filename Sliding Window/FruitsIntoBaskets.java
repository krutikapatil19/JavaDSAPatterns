import java.util.HashMap;
public class FruitsIntoBaskets {
    public static int countOfFruits(int[] fruits){

        int left = 0;       //start of window
        int maxCount = 0;  //number of fruits

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

            //Count max fruits (valid window)
                maxCount = Math.max(maxCount, right -left+1);
        }
        return maxCount;
    }
    public static void main(String[] args){
        int[] fruits = {1,2,3,2,2};
        System.out.println(countOfFruits(fruits));
    }
}
