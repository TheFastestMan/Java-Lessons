package mainCurseProf.lesson13Thread.part1.waiting;

public class Product {
    int id;

    synchronized void getIdProduct(){
        System.out.println("Get " + this.id);
    }
    synchronized  void setIdProduct(int id){
        this.id = id;
        System.out.println("Set "+ this.id);
    }
}
