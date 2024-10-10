public class ProdutoAlimenticio extends Produto {
    
    private double weight;
    private int validity;

    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public int getValidity() {
        return validity;
    }
    
    public void setValidity(int validity) {
        this.validity = validity;
    }
    
    public double calcDiscount(double percentage) {
        if (weight >= 1000) {
            return (1 - ((percentage + 10) / 100)) * price; // Pega a porcentagem inicial e adiciona mais 10% de desconto
        } else {
            return (1 - (percentage / 100)) * price;
        }
    }

}