package mainCurseProf.lesson6.stringSplit;

public class Main {
    public static void main(String[] args) {
        String str = "Allocates a new String that contains characters from a subarray of the character array argument. "+
                "The offset argument is the index of the first character of the subarray " +
                "and the count argument specifies the length of the subarray. The contents of the subarray are copied; " +
                "subsequent modification of the character array does not affect the newly created string.";
        String[] arr = str.split("[.,;]");
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
