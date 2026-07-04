import java.util.HashMap;
public class ValidAnagram {
    public static boolean isAnagram(String s1 , String s2){

        if(s1.length()!=s2.length())return false;

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashMap <Character, Integer> map = new HashMap<>();

        for(char ch: s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : s2.toCharArray()){

            if(!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch)-1);
        }

    }
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
    }
}
