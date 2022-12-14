package advence.thread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        myThread.shutDown();

    }
}
class MyThread extends Thread{
    private volatile boolean running = true; //volatile
    public void run(){
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void shutDown(){
        this.running = false;
    }
}