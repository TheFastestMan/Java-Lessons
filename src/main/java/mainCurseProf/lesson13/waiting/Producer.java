package mainCurseProf.lesson13.waiting;

public class Producer extends Thread {
    Product p;
    int count;

    public Producer(Product p, int count) {
        this.p = p;
        this.count = count;
    }
    public void run(){
        for (int i = 0; i < count; i++) {
            p.getIdProduct();
        }
    }
}
