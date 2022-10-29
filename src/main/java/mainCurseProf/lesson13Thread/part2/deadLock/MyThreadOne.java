package mainCurseProf.lesson13Thread.part2.deadLock;

public class MyThreadOne extends Thread {

    Thread t1;

   MyThreadOne(){
       System.out.println("myThreadOne create ");
   }
   public void setThread2(Thread t){
       this.t1 = t;
   }
   @Override
    public void run(){
       System.out.println("MyThreadOne start");
       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("MyThreadOne interrupts MyThreadTwo finish....");

       try {
           t1.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println("MyThread finished ");
   }
}
