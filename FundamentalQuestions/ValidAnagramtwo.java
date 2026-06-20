import java.util.HashMap;
public class ValidAnagramtwo {
    public static boolean isValidAnagram(String s1, String s2){


        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()) return false;

        //Creates a hashmap that stores character and its frequency
        HashMap<Character, Integer>map = new HashMap<>();

        for(int i = 0;i<s1.length();i++){
                map.put(s1.charAt(i),
                    map.getOrDefault(s1.charAt(i),0)+1);
            }

            for(int j = 0; j<s2.length();j++){
                int freq = map.getOrDefault(s2.charAt(j),0);

                if(freq == 0){
                    return false;
                }
                map.put(s2.charAt(j), freq -1);
            }

            for(int value : map.values()){
                if(value != 0){
                    return false;
                }
            }
            return true;
        }
    public static void main(String[]args){
        String s1 = "Eatss";
        String s2 = "Seat";
        System.out.println(isValidAnagram(s1,s2));
    }
}
