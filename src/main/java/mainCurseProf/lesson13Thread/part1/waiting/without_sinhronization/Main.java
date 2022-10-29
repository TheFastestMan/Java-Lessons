package mainCurseProf.lesson13Thread.part1.waiting.without_sinhronization;

public class Main {
    public static void main(String[] args) {
        Ticket[] t = {new Ticket(1), new Ticket(2), new Ticket(3), new Ticket(4)};

        Cashier c1 = new Cashier(11,t);
        Cashier c2 = new Cashier(22,t);
        Cashier c3 = new Cashier(33,t);
        Cashier c4 = new Cashier(44,t);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

    }
}
