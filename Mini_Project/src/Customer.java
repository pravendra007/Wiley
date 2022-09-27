import java.io.Serializable;

public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private int customerAreaCode;
	private int numberOfUnitsConsumed;
	private double totalBill;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, int customerAreaCode, int numberOfUnitsConsumed) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
		this.totalBill=this.calculateBill();
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAreaCode() {
		return customerAreaCode;
	}
	public void setCustomerAreaCode(int customerAreaCode) {
		this.customerAreaCode = customerAreaCode;
	}
	public int getNumberOfUnitsConsumed() {
		return numberOfUnitsConsumed;
	}
	public void setNumberOfUnitsConsumed(int numberOfUnitsConsumed) {
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
	}
	public double getTotalBill() {
		return totalBill;
	}
	
	public double calculateBill() {
		double total=0;
		if(numberOfUnitsConsumed<=100) {
			total=0.5*numberOfUnitsConsumed;
		}
		else if(numberOfUnitsConsumed>100 && numberOfUnitsConsumed<=150) {
			total=0.5*100+(numberOfUnitsConsumed-100)*0.75;
		}
		else {
			total=0.5*100+0.75*50+(numberOfUnitsConsumed-150);
		}
		totalBill=total;
		return total;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAreaCode="
				+ customerAreaCode + ", numberOfUnitsConsumed=" + numberOfUnitsConsumed + ", totalBill=" + totalBill
				+ "]";
	}
	
	
}
