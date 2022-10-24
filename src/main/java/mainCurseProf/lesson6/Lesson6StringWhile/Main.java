package mainCurseProf.lesson6.Lesson6StringWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Allocates a new String that contains characters from a subarray of the character array argument. "+
                "The offset argument is the index of the first character of the subarray " +
                "and the count argument specifies the length 45 of the subarray. The contents of the subarray are copied; " +
                "subsequent modification of the character array does not affect the newly 99 created string.";
        Scanner sc = new Scanner(str);
        while (sc.hasNextLine()){
            if (sc.hasNext("subarray")){
                System.out.println(sc.next());
            }else if (sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }else {
                sc.next();
            }
        }
    }
}
