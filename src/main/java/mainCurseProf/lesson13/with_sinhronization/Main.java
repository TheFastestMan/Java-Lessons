package mainCurseProf.lesson13.with_sinhronization;

import mainCurseProf.lesson13.without_sinhronization.Cashier;
import mainCurseProf.lesson13.without_sinhronization.Ticket;

public class Main {
    public static void main(String[] args) {
        Tickets[] t = {new Tickets(10),
                       new Tickets(20),
                       new Tickets(30),
                       new Tickets(40)};

        Cashiers c1 = new Cashiers(11,t);
        Cashiers c2 = new Cashiers(22,t);
        Cashiers c3 = new Cashiers(33,t);
        Cashiers c4 = new Cashiers(44,t);

        c1.start();
        c2.start();
        c3.start();
        c4.start();




    }
}
