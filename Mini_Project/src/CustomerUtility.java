import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerUtility {
	
	public static void displayAllCustomers(List<Customer> customerList) {
		if(customerList.isEmpty()) {
			System.out.println("No Customer found!!");
			return;
		}
		for(int i=0;i<customerList.size();i++) {
			Customer c=customerList.get(i);
			System.out.println("Details of Customer "+(i+1)+" :");
			System.out.println();
			System.out.println("Customer Id : "+c.getCustomerId());
			System.out.println("Customer Name : "+c.getCustomerName());
			System.out.println("Customer Area Code : "+c.getCustomerAreaCode());
			System.out.println("Number of units consumed : "+c.getNumberOfUnitsConsumed());
			System.out.println("Total Bill :"+c.getTotalBill());
			
			System.out.println();
		}
	}
	
	public static void displayCustomersByBill(List<Customer> customerList) {
		
		Collections.sort(customerList,(c1,c2)->{
			if(c1.getTotalBill()<c2.getTotalBill())
				return 1;
			return -1;
		});
		
		displayAllCustomers(customerList);
	}
	
	public static void detailsOfCustomersByAreaCode(List<Customer> customerList,int searchAreaCode) {
		
		List<Customer> modifiedList = (List<Customer>)customerList.stream()
																	.filter(p->p.getCustomerAreaCode()==searchAreaCode)
																	.collect(Collectors.toList());
		displayAllCustomers(modifiedList);
	}
}
