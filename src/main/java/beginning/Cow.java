package beginning;

public class Cow extends Mammals {

    public Cow(String nikName, int id) {
        super(nikName, id);
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }
    public void moo(){
        System.out.println("Cow is mooing");
    }
}
