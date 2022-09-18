import java.util.Arrays;

public class Employee {
	int empId;
	String empName;
	Address[] empAddresses;
	public Employee(int empId, String empName, Address[] empAddresses) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddresses = empAddresses;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddresses=" + Arrays.toString(empAddresses)
				+ "]";
	}
	
	public void printEmp() {
		System.out.println("Employee ID: "+ this.empId);
		System.out.println("Employee Name: "+ this.empName);
		System.out.println("Employee Temporary Address: "+ this.empAddresses[0]);
		System.out.println("Employee Temporary Address: "+ this.empAddresses[1]);
		
	}
}
