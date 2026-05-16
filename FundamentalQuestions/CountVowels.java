public class CountVowels {
    public static int vowelsCount(String s){

        //counter initialization - to keep count of vowels
        int count = 0;

        for(int i = 0;i<s.length();i++){

            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String s = "Programming";
        System.out.println(vowelsCount(s));
    }
}
