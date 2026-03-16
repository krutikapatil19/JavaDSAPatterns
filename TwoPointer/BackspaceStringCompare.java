public class BackspaceStringCompare {
    public static boolean backSpaceCompare(String s , String t) {

        //pointer for string s (starts from end )
        int i = s.length()-1;

        //pointer for string t(starts from end )
        int j = t.length()-1;

        //how many characters to skip in s due to '#'
        int skipS = 0;

        //how many charcters to skip in t due to '#'
        int skipT = 0;

        //continue until both strings are fully processed
        while(i>=0 || j>= 0){
        
            //if current char in s is '#', increase skip count
            if(i>=0 && s.charAt(i) == '#'){
                skipS++;        //one character should be skipped
                i--;            //move pointer left 
                continue;       //restart loop
            } 
            //skip characters that were deleted by '#'
            else if (skipS > 0) {
                skipS --;       //one character should be skipped
                i--;            //move pointer left 
                continue;
            }


        //if current char in t is '#',increase skip count
        if(j>= 0 && t.charAt(j) == '#') {
            skipT++;        //one character should be skipped
            j--;            //move one pointer left 
            continue;
        } 
        //skip characters deleted by '#'
        else if(skipT > 0) {
            skipT--;
            j--;
            continue;
        }

        //compare valid characters of both strings
        if(i >= 0 && j>= 0 && s.charAt(i) != t.charAt(j))
            return false;

        //if only one string still has characters
        if((i>= 0) != (j >= 0))
            return false;

        //move both pointers to next characters
        i--;
        j--;
    }

    //if loop finishes , strings are equal after backspaces
    return true;
    }
    public static void main(String[] args){
        String s = "ab#c";
        String t = "ad#c";

        //print result of comparison
        System.out.println(backSpaceCompare(s,t));
    }
}

