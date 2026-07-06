import java.util.HashMap;
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s1, String s2){

        if(s1.length() != s2.length())return false;

        HashMap<Character, Character>map = new HashMap<>();

        for(int i = 0; i<s1.length(); i++){

            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2) {
                    return false;
                }
            }
            else {
                if(map.containsValue(ch2)){
                    return false;
                }
                map.put(ch1, ch2);
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "egg";
        String s2 = "add";
        System.out.println(isIsomorphic(s1,s2));
    }
}
