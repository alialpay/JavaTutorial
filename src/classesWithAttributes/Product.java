package classesWithAttributes;

public class Product {
    public Product() {
    }

    public Product(int id, String name, String describe, double price, int stockAmount, String renk) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
    }

    //attribute | field
    private int id;
    private String name;
    private String describe;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }
}
