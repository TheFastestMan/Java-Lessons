package beginning;

public class SetAndGet {
    public static void main(String[] args) {
        Human person1 = new Human("Lui",0);
        Human person2 = new Human("Lui",0);
        Human person3 = new Human("Lui",0);
        Human person4 = new Human("Lui",0);
        Human person5 = new Human("Lui",0);
        person1.setAge(333);
        person1.setName("Jordan");
        Human.numberOfPeople();





        System.out.println(person1);
        System.out.println(person1.getName()+" "+person1.getAge());
    }
}
