import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of Customers you want to insert in the system");
		int n=sc.nextInt();
		
		List<Customer> customerList = new ArrayList<>();
		Map<String,List<Customer>> map = new HashMap<>();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the details of Customer "+i+" :");
			int cid=sc.nextInt();
			sc.nextLine();
			String cname=sc.nextLine();
			int areaCode=sc.nextInt();
			int units=sc.nextInt();
			
			Customer c= new Customer(cid,cname,areaCode,units);
			c.calculateBill();
			
			customerList.add(c);
		}
		System.out.println("--------Electricity Bill Generator--------");
		System.out.println();
		boolean flag=true;
		do {
			flag=false;
			System.out.println("Press 1 to display all the customers");
			System.out.println("Press 2 to see the customers arranged in descending order of their bill");
			System.out.println("Press 3 to see all the customers in the given Customer Area Code");
			System.out.println("Press 4 to check the mapping of Area code with the customers");
			System.out.println("Press 5 to serialize and deserialize objects");
			System.out.println("Press 6 to exit");
			System.out.println();
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				CustomerUtility.displayAllCustomers(customerList);
				break;
			}
			case 2:{
				CustomerUtility.displayCustomersByBill(customerList);
				break;
			}
			case 3:{
				System.out.println("Enter the area code to get all the customers from that particular area");
				int code=sc.nextInt();
				CustomerUtility.detailsOfCustomersByAreaCode(customerList,code);
				break;
			}
			case 4:{
				mapCustomerByAreaCode(customerList,map);
				break;
			}
			case 5:{
				serializeAllCustomers(customerList);
				deserializeAllCustomers();
				break;
			}
			case 6:{
				flag=false;
				break;
			}
			default:{
				System.out.println("Invalid Input!!");
				break;
			}
			}
			System.out.println();
			sc.nextLine();
			System.out.println("Enter Y to continue and N to exit: Y/N");
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("N"))
				flag=false;
			else if(input.equalsIgnoreCase("Y"))
					flag=true;
		}
		while(flag);
				
		
	}
	public static void mapCustomerByAreaCode(List<Customer> customerList,Map<String,List<Customer>> map) {
		for(Customer c: customerList) {
			String key=Integer.toString(c.getCustomerAreaCode());
			map.putIfAbsent(key,new ArrayList<Customer>());
			map.get(key).add(c);
		}
		System.out.println(map);
	}
	public static void serializeAllCustomers(List<Customer> customerList) {
		
		try(FileOutputStream fos= new FileOutputStream("customers.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(customerList);
			System.out.println("Objects serialized!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deserializeAllCustomers() {
		
		try(FileInputStream fis = new FileInputStream("customers.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			List<Customer> customerList = (List<Customer>)ois.readObject();
			System.out.println("List of customers obtained after deserialization:");
			CustomerUtility.displayAllCustomers(customerList);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
