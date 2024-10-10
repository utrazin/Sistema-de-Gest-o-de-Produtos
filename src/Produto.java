public class Produto {
    
    protected String name;
    protected double price;

    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double calcDiscount(double percentage) {
        return (1 - (percentage / 100)) * price;
    }

}