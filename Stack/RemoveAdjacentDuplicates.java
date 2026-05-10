public class RemoveAdjacentDuplicates {
    public static String removeDuplicates(String s) {

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()) {

            int len = sb.length();

            // if last character is same, remove it
            if(len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1);
            }
            else {
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