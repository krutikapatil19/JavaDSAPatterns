import java.util.HashMap;
public class ValidAnagram {
    public static boolean isAnagram(String s1, String s2){
        
        //if length of both string is different , then they cant be anagrams
        if(s1.length()!= s2.length())return false;

        //lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s1.toCharArray()){

            //to store the frequency of characters
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        //string2 traversal

        //take each character fro string 2 one by one 
        for(char ch : s2.toCharArray()) {

            //check if character exists in hashmap , if not then return false 
            if(!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch)==0){
                map.remove(ch);
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
