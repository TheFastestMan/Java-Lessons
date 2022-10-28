package mainCurseProf.lesson13;

import java.util.ArrayList;

public class Main extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(new Main());
        t.start();
        ArrayList arr = new ArrayList();

        for (int i = 0; i < 1000; i++) {
            arr.add(new Object());
        }
        System.out.println("Hello");
    }
    @Override
    public void run(){
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
