package staticDemo;

public class ProductValidator {
    static {
        System.out.println("Static yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }
    // bir metodu static yaptığınızda . ile çağrılabilir. new'leme olmaz
    public static boolean isValid(Product product){
        if (product.price > 0 && !product.name.isEmpty()) {

            return true;
        }else {
            return false;
        }
    }

    //bunu çağırabilmek için ProductValidator'ü new'lememiz lazım.
    public void bisey(){

    }

// inner class
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
