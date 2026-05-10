public class RemoveAdjacentDuplicates {
    public String removeDuplicates(String s) {

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
}