package mainCurseProf.lesson13.correctWaiting;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        Producer pr = new Producer(p,5);
        Consumer con = new Consumer(p,5);

        pr.start();
        con.start();
    }
}
