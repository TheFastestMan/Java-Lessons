package mainCurseProf.lesson13.waiting;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Producer producer = new Producer(product,5);
        Consumer consumer = new Consumer(product,5);

        producer.start();
        consumer.start();
    }
}
