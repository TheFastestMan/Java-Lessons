package beginning;

public class Horse extends Mammals {
    public Horse(String nikName, int id) {
        super(nikName, id);
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }
    public void neighs(){
        System.out.println("Horse is neighing");
    }
}
