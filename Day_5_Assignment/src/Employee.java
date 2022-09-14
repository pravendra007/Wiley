import java.util.Objects;

public class Employee {
	int empId;
	String empName;
	String empDept;
	double empBasicSalary;
	double grossSalary;
	
	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		this.grossSalary=calculateGrossSalary(empBasicSalary);
	}
	
	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empBasicSalary="
				+ empBasicSalary + ", grossSalary=" + grossSalary + "]";
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	public void setEmpBasicSalary(double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
	}

	public double calculateGrossSalary(double empBasicSalary)
	{
		double hra=0.12*empBasicSalary;
		double da=0.08*empBasicSalary;
		
		return empBasicSalary+hra+da;
	}
}
