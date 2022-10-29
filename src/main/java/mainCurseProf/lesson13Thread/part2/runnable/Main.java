package mainCurseProf.lesson13Thread.part2.runnable;

public class Main {
    public static void main(String[] args) {
      MyRun ping = new MyRun("ping",1000);
      MyRun pong = new MyRun("pong",2000);

       Thread t1 = new Thread(ping);
       Thread t2 = new Thread(pong);

       t1.run();
       t2.run();
    }
}
