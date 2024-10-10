public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();

        ProdutoEletronico product1 = new ProdutoEletronico();
        product1.setName("Celular");
        product1.setPrice(3000);
        product1.setBrand("Apple");
        product1.setGuarantee(2);

        ProdutoAlimenticio product2 = new ProdutoAlimenticio();
        product2.setName("Carne");
        product2.setPrice(80);
        product2.setValidity(2);
        product2.setWeight(2000);

        ProdutoEletronico product3 = new ProdutoEletronico();
        product3.setName("Tablet");
        product3.setPrice(1000);
        product3.setBrand("Apple");
        product3.setGuarantee(3);

        ProdutoAlimenticio product4 = new ProdutoAlimenticio();
        product4.setName("Peixe");
        product4.setPrice(100);
        product4.setValidity(4);
        product4.setWeight(500);

        estoque.addProduct(product1);
        estoque.addProduct(product2);
        estoque.addProduct(product3);
        estoque.addProduct(product4);

        estoque.setPercentage(10); // Define a porcentagem de desconto padrão como 10

        estoque.showPriceWithDiscount(estoque.getAvailable());
    }
}