package binary.hws;

public class House {
    private String houseType;
    private int numBedrooms;
    private int numBathrooms;

    public void enterHouse() {
        System.out.println("Now entering house");
    }

    public double sold(double housePrice ) {
        return housePrice;
    }

    public double rent(double priceOfRent) {
        return priceOfRent;
    }
}
