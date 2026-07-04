import java.util.HashMap;
public class ValidAnagram {
    public static boolean isAnagram(String s1 , String s2){

        //if lengths of both strings are different , then they can't be anagrams
        if(s1.length()!=s2.length())return false;

        //convert both strings to LowerCase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //Hashmap to store frequency of string characters
        HashMap <Character, Integer> map = new HashMap<>();

        for(char ch: s1.toCharArray()){

            //to store the frequency of characters
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : s2.toCharArray()){

            if(!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch)-1);

            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1,s2));
    }
}
