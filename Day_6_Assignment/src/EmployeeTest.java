
public class EmployeeTest {
	public static void main(String args[]) {
		Address tempAddress = new Address(302,"xyz","abc road","Bhopal"); 
		Address permAddress = new Address(305,"pqr","mno road","Lalitpur"); 
		
		Address empAddressArray[]= {tempAddress,permAddress};
		
		Employee emp1 = new Employee(101,"Pravendra",empAddressArray);
		
		emp1.printEmp();
		
	}
}
