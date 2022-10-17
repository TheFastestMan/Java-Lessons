package beginning;

public class Mammals {
    private String nikName;
    private int id;

    public Mammals(String nikName, int id) {
        this.nikName = nikName;
        this.id = id;
    }

    @Override
    public String toString() {
        return nikName +" "+ id ;
    }

    public void eat() {
        System.out.println("Mammal is eating");
    }
    public void makeSound(){
        System.out.println("Mammal is making a sound");
    }
}
