import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> available;
    private double percentage;
    
    public Estoque() {
        this.available = new ArrayList<>();
    }

    public List<Produto> getAvailable() {
        return available;
    }
    
    public void setAvailable(List<Produto> available) {
        this.available = available;
    }
    
    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    public void addProduct(Produto product) {
        available.add(product);
    }
    
    public void removeProduct(Produto product) {
        available.remove(product);
    }
    
    public void showPriceWithDiscount(List<Produto> products) {
        for (Produto product : products) {
            double priceWithDiscount = product.calcDiscount(percentage);
            System.out.println("Product: " + product.getName() + ", Price with discount: R$" + String.format("%.2f", priceWithDiscount));
        }
    }

}