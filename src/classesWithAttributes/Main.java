package classesWithAttributes;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "laptop", "asus", 10000, 3, "mavi");
/*
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescribe("Asus Laptop");;
        product.setPrice(5000);
        product.setStockAmount(3);
*/
        ProductManger productManger = new ProductManger();
        productManger.Add(product);

        System.out.println(product.getName());
    }
}
