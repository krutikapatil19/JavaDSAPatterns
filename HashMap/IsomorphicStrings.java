import java.util.HashMap;
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s1, String s2){

        if(s1.length() != s2.length())return false;

        HashMap<Character, Character>map = new HashMap<>();
    }
    public static void main(String[] args){
        String s1 = "egg";
        String s2 = "add";
        System.out.println(isIsomorphic(s1,s2));
    }
}
