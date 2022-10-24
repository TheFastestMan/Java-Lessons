package mainCurseProf.lesson5.StringBilderandStringBuffer;

public class Main {
    public static void main(String[] args) {
//        String str1 = "World";
//        String str2 = "World";
//
//        System.out.println(str1+str2);
//
//        String strBild = new StringBuilder().append(str1).append(str2).toString();

        StringBuffer strBuff = new StringBuffer();
        System.out.println("Length -> "+strBuff.length());
        System.out.println("Capacity -> "+strBuff.capacity());
        strBuff.append("Java");
        System.out.println("String -> "+strBuff);
        System.out.println("Length -> "+strBuff.length());
        System.out.println("Capacity -> "+strBuff.capacity());
        System.out.println("Revers-> "+ strBuff.reverse());




    }
}
