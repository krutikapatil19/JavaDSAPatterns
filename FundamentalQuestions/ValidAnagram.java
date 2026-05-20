import java.util.HashMap;
import java.util.Map;
public class ValidAnagram {
    public static boolean isAnagram(String s1, String s2){

        int i = 0;
        int j = 0;
        if(s1.length()!= s2.length())return false;

        HashMap<Character,Integer> map = new HashMap<>();

        char ch = s1.charAt(i);

        map.put(ch, getOrDefault(ch, 0)+1);

        for( i = 0; i<s2.length(); i++){
            if(!Map.containsKey(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));
    }
}
