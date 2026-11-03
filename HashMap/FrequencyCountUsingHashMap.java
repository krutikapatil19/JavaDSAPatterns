import java.util.HashMap;
import java.util.Map;
public class FrequencyCountUsingHashMap {

    public static Map<Character,Integer> countFrequency(String str){

        Map<Character,Integer> freqCount = new HashMap<>();

        str= str.toLowerCase();

        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);

            freqCount.put(c,freqCount.getOrDefault(c, 0)+1);
        }
        return freqCount;
    }
    public static void main(String[]args){
        String str = "Krutika Patil";
        System.out.println(countFrequency(str));
    }
}