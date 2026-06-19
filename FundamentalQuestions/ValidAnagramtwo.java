import java.util.HashMap;
public class ValidAnagramtwo {
    public static boolean isValidAnagram(String s1, String s2){


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()) return false;

        //Creates a hashmap that stores character and its frequency
        HashMap<Character, Integer>map = new HashMap<>();

        for(int i = 0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),
                    map.getOrDefault(s1.charAt(i),0)+1);
                } else {
                    map.put(s1.charAt(i),1);
                }
            }

        }
    }
    public static void main(String[]args){
        String s1 = "Eats";
        String s2 = "Seat";
        System.out.println(isValidAnagram(s1,s2));
    }
}
