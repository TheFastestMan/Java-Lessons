package mainCurseProf.lesson1.interfaceComparatorWithAnonims;

public class Potato {
     String variety;
     int price;
     int averageWeightOfUnit;
     int rateOfQuality;

    public Potato(String variety, int price, int averageWeightOfUnit, int rateOfQuality) {
        this.variety = variety;
        this.price = price;
        this.averageWeightOfUnit = averageWeightOfUnit;
        this.rateOfQuality = rateOfQuality;
    }


    @Override
    public String toString() {
        return "Potato{" +
                "variety='" + variety + '\'' +
                ", price=" + price +
                ", averageWeightOfUnit=" + averageWeightOfUnit +
                ", rateOfQuality=" + rateOfQuality +
                '}';
    }
}
