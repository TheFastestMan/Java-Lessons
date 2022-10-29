package mainCurseProf.lesson13Thread.part1.waiting.with_sinhronization;

public class Tickets {
    boolean isBought;
    int place;

    Tickets(int place) {
        this.place = place;
    }

     synchronized void buy(Cashiers c) {
        if (!isBought){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            isBought = true;
            System.out.println("Cashier "+ c.id + " ticket " + this.place);
        }
    }
}
