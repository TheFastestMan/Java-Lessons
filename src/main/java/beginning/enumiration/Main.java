package beginning.enumiration;

public class Main {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        Animal animal1 = Animal.HORSE;
        Items i1 = Items.APPLIANCE;
        Items i2 = Items.PROPERTY;

        System.out.println(i1.name());
        System.out.println(i1.compareTo(Items.PROPERTY));
        System.out.println(i1 instanceof Enum);
        System.out.println(Items.valueOf("VEHICLE"));
        System.out.println(i1.ordinal());
        System.out.println(i2.ordinal());

//        switch (animal){
//            case CAT -> System.out.println("It is a CAT");
//            case DOG -> System.out.println("It is a DOG");
//            case HORSE -> System.out.println("It is a HORSE");
//            case SPIDER -> System.out.println("It is a SPIDER");
//            case ELEPHANT -> System.out.println("It is a ELEPHANT");
//            default -> System.out.println("It is not an ANIMAL");
//        }

        switch (i1){
            case APPLIANCE:
                System.out.println("It is the appliances");
                break;
            default:
                System.out.println("There is nothing have found");
        }


    }
}
