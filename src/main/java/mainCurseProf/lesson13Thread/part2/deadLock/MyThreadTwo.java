package mainCurseProf.lesson13Thread.part2.deadLock;

public class MyThreadTwo extends Thread{
    private Thread t2;

    MyThreadTwo(){
        System.out.println("MyThreadTwo created");
    }
    public void setThread1(Thread t){
        this.t2 = t;
    }
    @Override
    public void run(){
        System.out.println("MyThreadTwo start");

        System.out.println("MyThreadTwo interrupts MyThreadOne finish....");

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadTwo finished");
    }

}
