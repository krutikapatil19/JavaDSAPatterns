public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {

        //String builder works like a stack 
        StringBuilder sb = new StringBuilder();

        //Traverse each character
        for(char ch : s.toCharArray()) {

            //current length of String builder
            int len = sb.length();

            // if last character is same, remove it
            if(len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1);
            }
            else {
                //otherwise add current character
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
}