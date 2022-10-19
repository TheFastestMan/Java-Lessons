package beginning.enumiration;

import org.w3c.dom.ls.LSOutput;

public enum Items {
    PROPERTY("Home",10000), VEHICLE("Car",5000), APPLIANCE("Oven", 300);

    private String nameOfItems;
    private  int priceOfItems;

    Items(String nameOfItems, int priceOfItems) {
        this.nameOfItems = nameOfItems;
        this.priceOfItems = priceOfItems;
    }

    public String getNameOfItems() {
        return nameOfItems;
    }

    public int getPriceOfItems() {
        return priceOfItems;
    }

    @Override
    public String toString() {
        return nameOfItems +" "+ priceOfItems;
    }
}
