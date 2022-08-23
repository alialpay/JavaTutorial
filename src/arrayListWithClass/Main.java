package arrayListWithClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer engin = new Customer(1,"Engin","adfad");
        customers.add(engin);
        customers.add(new Customer(1,"Ali","Alpay"));
        customers.add(new Customer(2,"Alias","Alpay"));
        customers.add(new Customer(3,"Alisfad","Alpay"));

        customers.remove(engin);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
