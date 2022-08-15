package interfaces;

public class MySqlCustomerDao implements ICustomerDao, IRepository{
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}
