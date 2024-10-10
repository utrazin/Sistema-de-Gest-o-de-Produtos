public class ProdutoEletronico extends Produto{
    
    private String brand;
    private int guarantee;

    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getGuarantee() {
        return guarantee;
    }
    
    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }
    
    public double calcDiscount(double percentage) {
        if (price >= 2000) {
            return (1 - ((percentage + 5) / 100)) * price; // Pega a porcentagem inicial e adiciona mais 5% de desconto
        } else {
            return (1 - (percentage / 100)) * price;
        }
    }

}