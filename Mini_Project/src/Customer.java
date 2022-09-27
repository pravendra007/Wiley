import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private int customerAreaCode;
	private int numberOfUnitsConsumed;
	private double totalBill;
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(customerAreaCode, customerId, customerName, numberOfUnitsConsumed, totalBill);
//	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Customer other = (Customer) obj;
		return customerAreaCode == other.customerAreaCode && customerId == other.customerId
				&& Objects.equals(customerName, other.customerName)
				&& numberOfUnitsConsumed == other.numberOfUnitsConsumed
				&& Double.doubleToLongBits(totalBill) == Double.doubleToLongBits(other.totalBill);
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
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
	public String getCustomerName() {
		return customerName;
	}
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
	public int getCustomerAreaCode() {
		return customerAreaCode;
	}
//	public void setCustomerAreaCode(int customerAreaCode) {
//		this.customerAreaCode = customerAreaCode;
//	}
	public int getNumberOfUnitsConsumed() {
		return numberOfUnitsConsumed;
	}
//	public void setNumberOfUnitsConsumed(int numberOfUnitsConsumed) {
//		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
//	}
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
