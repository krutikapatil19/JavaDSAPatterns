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

        //string 2 traversal
        //take each character from string 2 one by one 
        for(char ch : s2.toCharArray()){

            //check if character exists in hashmap, if not then return false
            if(!map.containsKey(ch)) return false;

            //else , reduce frequency, as one occurence of this character has been used
            map.put(ch, map.get(ch)-1);

            //remove character if frequency of that character becomes 0
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
