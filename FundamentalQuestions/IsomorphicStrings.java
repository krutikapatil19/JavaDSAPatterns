import java.util.HashMap;
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s1, String s2) {

        //if the lengths are different , the strings cannot be isomorphic
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        //Traverse both Strings
        for (int i = 0; i < s1.length(); i++) {

            //Get current characters 
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            //check if the character from s1 mapped before 
            if (map.containsKey(ch1)) {
                // compare if the old mapping matches current mapping , if not then return false 
                if (map.get(ch1) != ch2) {
                    return false;
                }
            } 
            //character has never appeared before
            else {

                //if ch2 is already being used by another character 
                if(map.containsValue(ch2)){
                    return false;
                }
                //store the new mapping 
                map.put(ch1, ch2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println(isIsomorphic(s1, s2));
    }
}
