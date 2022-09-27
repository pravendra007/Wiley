import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class CustomerUtilityTest {
	@Test
	public void testsorted() {
		Customer obj1 = new Customer(1001, "Parth", 123456, 100);
		Customer obj2 = new Customer(1002, "Koena", 654321, 200) ;
		Customer obj3 = new Customer(1003, "Pravendra", 987654, 150);
		
		List<Customer> actual = new ArrayList<>();
		actual.add(obj1);
		actual.add(obj2);
		actual.add(obj3);
		
		List<Customer> expected = new ArrayList<>();
		expected.add(obj2);
		expected.add(obj3);
		expected.add(obj1);
		
		assertEquals("Error in Sorting", expected, CustomerUtility.displayCustomersByBill(actual));
		assertEquals("Error in Sorting",new ArrayList<Customer>() , CustomerUtility.displayCustomersByBill(new ArrayList<Customer>()));
		
		
	}
	
	@Test
	public void testareacode() {
		Customer obj1 = new Customer(1001, "Parth", 123456, 100);
		Customer obj2 = new Customer(1002, "Koena", 654321, 200) ;
		Customer obj3 = new Customer(1003, "Pravendra", 123456, 150);
		
		ArrayList<Customer> actual = new ArrayList<>();
		actual.add(obj1);
		actual.add(obj2);
		actual.add(obj3);
		
		ArrayList<Customer> expected = new ArrayList<>();
		expected.add(obj1);
		expected.add(obj3);
		
		assertEquals("Error in Filtering", expected, CustomerUtility.detailsOfCustomersByAreaCode(actual, 123456));		
	}
	
	@Test 
	public void testmap() {
		Customer obj1 = new Customer(1001, "Parth", 123456, 100);
		Customer obj2 = new Customer(1002, "Koena", 654321, 200) ;
		Customer obj3 = new Customer(1003, "Pravendra", 123456, 150);
		
		ArrayList<Customer> actual = new ArrayList<>();
		actual.add(obj1);
		actual.add(obj2);
		actual.add(obj3);
		Map<String,List<Customer>> map = new HashMap<>();
		Map<String,List<Customer>> exp = new HashMap<>();
		
		exp.put("123456", new ArrayList<>());
		exp.get("123456").add(obj1);
		exp.get("123456").add(obj3);
		exp.put("654321", new ArrayList<>());
		exp.get("654321").add(obj2);
		
		
		assertEquals("Error in Mapping", exp, CustomerUtility.mapCustomerByAreaCode(actual, map));		
	}
	
	@Test 
	public void testdeserialize() {
		Customer obj1 = new Customer(1001, "Parth", 123456, 100);
		Customer obj2 = new Customer(1002, "Koena", 654321, 200) ;
		Customer obj3 = new Customer(1003, "Pravendra", 123456, 150);
		
		List<Customer> actual = new LinkedList<>();
		actual.add(obj1);
		actual.add(obj2);
		actual.add(obj3);
		
		List<Customer> expected = new LinkedList<>();
		expected.add(obj1);
		expected.add(obj2);
		expected.add(obj3);
		
		
		CustomerUtility.serializeAllCustomers(actual,"customers.dat");
		List<Customer> l1=CustomerUtility.deserializeAllCustomers("customers.dat");
		assertEquals("Error in Deserialization",expected,l1);
		assertEquals("Error in Deserialization",null,CustomerUtility.deserializeAllCustomers("dummy.dat"));
		
	}
}

