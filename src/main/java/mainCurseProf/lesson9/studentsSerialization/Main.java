package mainCurseProf.lesson9.studentsSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\79376\\IdeaProjects\\Java-Lessons\\src\\main\\java\\mainCurseProf\\lesson9/Text.txt");
        Student student = new Student(12, "Sean");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(f))) {
            outputStream.writeObject(student);
            student = null;
            student = (Student) inputStream.readObject();
            System.out.println(student);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
