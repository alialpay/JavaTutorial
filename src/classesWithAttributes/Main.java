package classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name="Laptop";
        product.id =1;
        product.describe="Asus Laptop";
        product.price=5000;
        product.stockAmount=3;

        ProductManger productManger = new ProductManger();
        productManger.Add(product);

        System.out.println(product.name);
    }
}
