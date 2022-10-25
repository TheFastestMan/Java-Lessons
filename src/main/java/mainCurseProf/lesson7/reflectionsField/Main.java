package mainCurseProf.lesson7.reflectionsField;

import java.lang.reflect.Field;

public class Main {
    private static final class CatFields{
        public String name = "Six";
        private int age = 6;
        short ears = 5;
        protected long tail = 30;
    }
    public static void main(String[] args) {
        String s1 = (char)+27+"[31m";
        String s2 = (char)+27+"[39m";
        String s3 = (char)+27+"[34m";

        Class<?> cl = CatFields.class;
        System.out.println(s1+"Public reflections fields:");

        Field[] fields = cl.getFields();

        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s2+"\tName: "+s1+field.getName());
            System.out.println(s2+"\tType: "+s1+fieldType.getName());

        }
        System.out.println(s1 + "All modifiers reflections fields:");
        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }
    }
}
