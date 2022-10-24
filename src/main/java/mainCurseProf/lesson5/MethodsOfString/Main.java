package mainCurseProf.lesson5.MethodsOfString;

public class Main {
    public static void main(String[] args) {
        String str0 = new String("Hello ");
        String str1 = new String("my ");
        String str2 = new String("friend");
        String str3 = new String("!");

//        System.out.println(str0.toUpperCase());
//        System.out.println(str0.toLowerCase());
//        System.out.println(str0.replace("H","B"));

//       char[] arr = {'a','b','c','j','d','f'};
//       String strExmpl = new String(arr,2,4);
//       System.out.println(strExmpl.toUpperCase());

        long t3 = System.nanoTime();
        String plus = str0+str1+str2+str3;
        long t4 = System.nanoTime();
        System.out.println(t4-t3);

        long t1 = System.nanoTime();
        String cun = str0.concat(str1).concat(str2).concat(str3);
        long t2 = System.nanoTime();
        System.out.println(t2-t1);

        long t5 = System.nanoTime();
        String sBild = new StringBuilder().append(str0).append(str1).append(str2).append(str3).toString();
        long t6 = System.nanoTime();
        System.out.println(t6-t5);

//        System.out.println(t2-t1);
//        System.out.println(t4-t3);

//        System.out.println(str0.equals("Hello "));
//        System.out.println(str0.equalsIgnoreCase("HELLO "));
//        System.out.println(str0.startsWith("H"));
//        System.out.println(str0.endsWith(" "));
//        System.out.println(str0.substring(2));
//        System.out.println(str0.substring(0,2));
//        System.out.println(str0.length());
//        System.out.println(str0.indexOf('o'));

        Integer i1 = 55;
//        System.out.println(i1.toString());
//        System.out.println(Integer.toString(i1));

        Integer i2 = null;

//        System.out.println(String.valueOf(i2));
//        System.out.println(String.valueOf(i1) instanceof String);
//        System.out.println(String.valueOf(null));







    }
}
