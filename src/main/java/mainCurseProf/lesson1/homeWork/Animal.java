package mainCurseProf.lesson1.homeWork;

public class Animal implements Comparable{
    String name;
    String color;
    int weight;
    int speed;
    int price;

    public Animal(String name, String color, int weight, int speed, int price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return name +" "+ color +" "+ weight +" "+ speed +" "+ price;
    }

    @Override
    public int compareTo(Object o) {
        int x = this.speed - ((Animal)o).speed;

        if (this.speed==speed){
            x = this.price - ((Animal)o).price;
        }else if(this.price==price){
            x = this.color.compareTo(color);
        } else if(this.color.equals(color)){
            x = this.weight - ((Animal)o).weight;
        } else
            System.out.println("Fuck you");
        return x;


    }
}
