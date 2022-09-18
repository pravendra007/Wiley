
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount customer1 = new BankAccount(101,"Pravendra",BankAccountType.CURRENT);
		
		double interest1;
		try {
			interest1 = customer1.calculateTotalInterest(8000, 2);
			System.out.println("Interest generated: "+interest1);
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		BankAccount customer2 = new BankAccount(102,"Prashant",BankAccountType.SAVINGS);
		
		double interest2;
		try {
			interest2 = customer2.calculateTotalInterest(-500,1);
			System.out.println("Interest generated: "+ interest2);
		} catch (DepositAmountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
