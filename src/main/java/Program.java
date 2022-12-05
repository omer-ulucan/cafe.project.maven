import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        BaseCustomerManager customerManagerNero = new NeroCustomerManager();
        customerManagerNero.Save(new Customer("Omer","Ulucan", LocalDate.of(2002, 9,16),"11111111110"));
        System.out.println("customerManagerNero = " + customerManagerNero);
    }
}
