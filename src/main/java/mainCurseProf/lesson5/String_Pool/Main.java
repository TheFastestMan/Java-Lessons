package mainCurseProf.lesson5.String_Pool;

public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = str1;
//        System.out.println(str1==str2);
//        str1 += " world";
//        str2 += " world";
//        System.out.println(str1 == str2);
//        System.out.println(str1);
//        System.out.println(str2);

        String s1 = "World";
        String s2 = "World";

        String s3 = new String("World");
        String s4 = new String("World");

//        System.out.println(s1 == s2);
//        System.out.println(s3 == s4);
//        System.out.println(s1 == s4);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s3);
//        System.out.println(s2 == s4);

        Integer a = 128; // пул значений(оберток строк)в хипе имеет память на 1 байт, при выходе из этого диап-на jvm создает новый пул, поэтому они не равны
        Integer b = 128;
        Integer c1 = 1;
        Integer c2 = 1;
//        Integer aNew = new Integer(10);
//        Integer bNew = new Integer(10);
        Character cNew = 127;
        Character mNew = 127;

        System.out.println(a == b);
        System.out.println(c1 == c2);
//        System.out.println(aNew == bNew);
        System.out.println(mNew == cNew);

    }
}
