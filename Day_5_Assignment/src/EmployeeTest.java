import java.util.*;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee e1=new Employee(101,"Pankaj","HR",20000.0);
		Employee e2=new Employee(102,"Pravendra","IT",25000.0);
		Employee e3=new Employee(103,"Prashant","Management",22000.0);
		Employee e4=new Employee(104,"Suresh","HR",23000.0);
		Employee e5=new Employee(105,"Naman","HR",26000.0);
		
		Employee empArray[] = {e1,e2,e3,e4,e5};
		
		sortEmployee(empArray);
		
		for(int i=0;i<5;i++)
			System.out.println(empArray[i]);
		
		searchEmployees(empArray,"HR");
		
		Employee emp1=new Employee(108,"Archit","HR",21000.0);
		Employee emp2=new Employee(108,"Archit","HR",21000.0);
		
		if(emp1.equals(emp2))
			System.out.println("Same Employee");
		else
			System.out.println("Different Employee");
	}
	public static void sortEmployee(Employee empArray[]) {
		Arrays.sort(empArray,new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if(e1.getEmpBasicSalary()<e2.getEmpBasicSalary())
					return -1;
				return 1;
			}
		});
	}
	public static void searchEmployees(Employee empArray[],String searchDept) {
		for(int i=0;i<empArray.length;i++)
		{
			if(empArray[i].getEmpDept().equals(searchDept)){
				System.out.println(empArray[i]);
			}
		}
	}
}
