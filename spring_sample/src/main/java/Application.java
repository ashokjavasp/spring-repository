import com.cloudsys.service.CustomerService;
import com.cloudsys.service.CustomerServiceImpl;

public class Application {
	public static void main(String args[]) {
		
		CustomerService customerService = new CustomerServiceImpl();
		System.out.println(customerService.findAll().get(0).getFirstName());
		
	}

}
