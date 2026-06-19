import java.util.HashMap;
public class validAnagrammm{
    public static boolean isAnagram(String s1, String s2){

        HashMap<Character, Integer> map = new HashMap<>();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length()!= s2.length()){
            return false;
        }
        for(int i = 0; i<s1.length(); i++){
                map.put(s1.charAt(i),
                    map.getOrDefault(s1.charAt(i), 0)+1);
                }

        for(int j = 0; j<s2.length();j++){
            int freq = map.getOrDefault(s2.charAt(j),0);

            if(freq == 0){
                return false;
            }

            map.put(s2.charAt(j), freq - 1);
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
/*I used a HashMap to store character frequencies of the first String.
Then I traversed the second string and decreased those frequencies.
If all frequencies became 0, the strings were anagrams; otherwise they were not.
*/