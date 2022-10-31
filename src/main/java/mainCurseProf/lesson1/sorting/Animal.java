package mainCurseProf.lesson1.sorting;

public class Animal {
    private String breed;
    private int hashCode;

    public Animal(String breed, int hashCode) {
        this.breed = breed;
        this.hashCode = hashCode;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", hashCode=" + hashCode +
                '}';
    }
}
