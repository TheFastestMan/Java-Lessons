package mainCurseProf.lesson13.correctWaiting;

class Product {
    int id;
    boolean isProduced;

    synchronized void getIdProduct(){
        if (!isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Get "+ this.id);
        isProduced = false;
        notify();
    }
    synchronized void setIdProduct(int id){
        if (isProduced){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.id = id;
        System.out.println("Set "+ this.id);
        isProduced = true;
        notify();

    }


}
