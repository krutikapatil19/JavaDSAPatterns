public class BackspaceStringCompare {
    public static boolean backSpaceCompare(String s , String t) {

        int i = s.length()-1;
        int j = t.length()-1;
        int skipS = 0;
        int skipT = 0;


        while(i>=0 || j>= 0){

            if(i>=0 && s.charAt(i) == '#'){
                skipS++;
                i--;
                continue;
            } else if (skipS > 0) {
                skipS --;
                i--;
                continue;
            }

            if(j>= 0 && t.charAt(j) == '#') {
                skipT++;
                j--;
                continue;
        } else if(skipT > 0) {
            skipT--;
            j--;
            continue;
        }

        if(i >= 0 && j>= 0 && s.charAt(i) != t.charAt(j))
            return false;

        if((i>= 0) != (j >= 0))
            return false;
        i--;
        j--;
    }
    return true;
     
    }
    public static void main(String[] args){
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backSpaceCompare(s,t));
    }
}

