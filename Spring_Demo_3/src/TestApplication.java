import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Customer;
import com.model.CustomerDAO;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerDAO obj = (CustomerDAO)context.getBean("repo1");
		
//		Customer c=new Customer(5,"Rohit Sharma");
//		int row=obj.updateCustomer(c);
//		if(row>0)
//			System.out.println("Done");
//		else
//			System.out.println("Failed");
		
		System.out.println(obj.deleteCustomer(5));
	}

}
