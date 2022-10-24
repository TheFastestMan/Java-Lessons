package mainCurseProf.lesson5.Intern;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println(str1==str2);
        System.out.println(str1.intern() == str3.intern());// intern этот метод проверяет и помещает в тот же пул если он существует.

        String aStr = "World";
        int aInt = 20;
        System.out.println(String.format("Hello,%s on line %d", aStr, aInt));
    }
}
