import java.util.HashMap;
public class validAnagrammm{
    public static boolean isAnagram(String s1, String s2){

        HashMap<Character, Integer> map = new HashMap<>();

        if(s1.length()!= s2.length()){
            return false;
        }
        for(int i = 0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),
                map.getOrDefault(s1.charAt(i), 0)+1);
            } else {
                map.put(s1.charAt(i),1);
            }
        }

        for(int j = 0; j<s2.length();j++){
            if(!map.containsKey(s2.charAt(j))){
                return false;
            }
            map.put(s2.charAt(j),
            map.get(s2.charAt(j))-1);
        }

        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "Eat";
        String s2 = "Ate";
        System.out.println(isAnagram(s1,s2));
    }
    
}