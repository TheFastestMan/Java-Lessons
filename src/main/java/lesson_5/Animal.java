package lesson_5;

class Animal {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Animal(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " "+ this.price;
    }
}
