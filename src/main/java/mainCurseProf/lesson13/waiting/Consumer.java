package mainCurseProf.lesson13.waiting;

public class Consumer extends Thread {
    Product p;
    int count;

    public Consumer(Product p, int count) {
        this.p = p;
        this.count = count;
    }
    @Override
    public void run(){
        for (int i = 0; i < count; i++) {
            p.getIdProduct();
        }
    }
}
