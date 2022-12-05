import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import org.checkerframework.checker.units.qual.C;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManagerNero = new NeroCustomerManager();
        customerManagerNero.Save(new Customer("Omer","Ulucan", LocalDate.of(2002,9,16),"1111111110"));
        System.out.println();

        BaseCustomerManager customerManagerStarBucks = new StarbucksCustomerManager(new CustomerCheckManager(){});

        customerManagerStarBucks.Save(new Customer("Ahmet","Ulucan",LocalDate.of(1007,2,2),"2111111112"));
        System.out.println();

        customerManagerNero.Delete(new Customer(2111111112));
    }
}
