package ku.shop;

public class Product {
    private double price;
    private String name;
    private int catalog;

    public Product(String name, double price,int catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    public int getCatalog() {
        return catalog;
    }

    public void setCatalog(int catalog) {
        this.catalog += catalog;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("Price must be not be negative zero");
        this.price = price;
    }
}
