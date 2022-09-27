import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
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
	
	public static List<Customer> displayCustomersByBill(List<Customer> customerList) {
		
		Collections.sort(customerList,(c1,c2)->{
			if(c1.getTotalBill()<c2.getTotalBill())
				return 1;
			return -1;
		});
		
		displayAllCustomers(customerList);
		return customerList;
	}
	
	public static List<Customer> detailsOfCustomersByAreaCode(List<Customer> customerList,int searchAreaCode) {
		
		List<Customer> modifiedList = (List<Customer>)customerList.stream()
																	.filter(p->p.getCustomerAreaCode()==searchAreaCode)
																	.collect(Collectors.toList());
		displayAllCustomers(modifiedList);
		return modifiedList;
	}
	
	public static Map<String,List<Customer>> mapCustomerByAreaCode(List<Customer> customerList,Map<String,List<Customer>> map) {
		for(Customer c: customerList) {
			String key=Integer.toString(c.getCustomerAreaCode());
			map.putIfAbsent(key,new ArrayList<Customer>());
			map.get(key).add(c);
		}
		System.out.println(map);
		return map;
	}
	public static void serializeAllCustomers(List<Customer> customerList,String file) {
		
		try(FileOutputStream fos= new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(customerList);
			System.out.println("Objects serialized!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static List<Customer> deserializeAllCustomers(String file) {
		
		try(FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			List<Customer> customerList = (List<Customer>)ois.readObject();
			System.out.println("List of customers obtained after deserialization:");
			CustomerUtility.displayAllCustomers(customerList);
			return customerList;
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
}
