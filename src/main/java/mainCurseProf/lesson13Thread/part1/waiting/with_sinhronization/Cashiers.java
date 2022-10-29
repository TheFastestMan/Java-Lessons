package mainCurseProf.lesson13Thread.part1.waiting.with_sinhronization;

public class Cashiers extends Thread {
    int id;
    Tickets [] t;

    public Cashiers(int id, Tickets[] t) {
        this.id = id;
        this.t = t;
    }
    public synchronized void run(){
        for (int i = 0; i < t.length; i++) {
//            if (!t[i].isBought){
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    System.out.println(e);
//                }
//                t[i].isBought = true;
//                System.out.println("Cashier "+ id +"ticket " + t[i].place);
//            }
            t[i].buy(this);
        }
    }
}
