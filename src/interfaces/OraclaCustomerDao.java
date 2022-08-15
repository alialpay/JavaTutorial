package interfaces;

public class OraclaCustomerDao implements ICustomerDao{
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
