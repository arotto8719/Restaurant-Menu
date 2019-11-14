package restaurant;

public class MenuItem {
    private String name;
    private double price;

public class Appetizers {
    int crabRangoon;
    int eggDropSoup;
//    int $6.37;
//    int $3.00;
}

    MenuItem (String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }
    MenuItem(Double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(Double aPrice) {
        this.price = aPrice;
    }
    public static void main(String[] args) {
        System.out.println("Appetizers" + ":" + "name" + ":" + "" + "price"  + ":" + "");
    }
}
