public class ReverseString {
    public static String reverse(String s){
        
        //converting the string to char array , so each character can be accessed independently
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        //used two pointers , i and j , i will start from beginning and j will start from the end , and run the while loop till i crosses j , and along with that , swapping arr[i] and arr[j].
        while(i<j){
           char temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
        }

        //convert the char array back to String ,and return .
        return new String(arr);         
    }
    public static void main(String[] args){
        String s = "Programming";
        System.out.println(reverse(s));
    }
}
