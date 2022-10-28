package mainCurseProf.lesson13.without_sinhronization;

public class Cashier extends Thread{
    int id;
    Ticket[] t;

    Cashier(int id, Ticket[] t) {
        this.id = id;
        this.t = t;
    }
    @Override
    public void run(){
        for (int i = 0; i <t.length ; i++) {
            if (!t[i].isBought){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                t[i].isBought = true;
                System.out.println("Cashier " + id + " ticket " + t[i].place);
            }
        }
    }
}

