package mainCurseProf.lesson7.simpleReflection;

public class SimpleReflection {
    public static void main(String[] args) {
        SimpleReflection simpleReflection = new SimpleReflection();
        Class<?> cl = simpleReflection.getClass();

        int[] arr = new int[10];
        Class<?> cl2 = arr.getClass();
        Class<?> cl3 = "World".getClass();
        Class<?> cl4 = Integer.valueOf(5).getClass();
        System.out.println(cl);
        System.out.println(cl2);
        System.out.println(cl3);
        System.out.println(cl4);

    }

}
