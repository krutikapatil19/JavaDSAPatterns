public class CountVowels {

    //Function to count vowels in a String
    public static int vowelsCount(String s){

        //counter initialization - to keep count of vowels
        int count = 0;

        //Loop through each character in string
        for(int i = 0;i<s.length();i++){

            char ch = s.charAt(i);

            //check if character is vowel
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                
                //increase count if vowel found
                count++;
            }
        }
        //return total number of vowels
        return count;
    }
    public static void main(String[] args){
        String s = "Programming";
        System.out.println(vowelsCount(s));
    }
}
