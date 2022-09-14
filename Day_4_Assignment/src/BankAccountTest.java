 
 public class BankAccountTest {
		public static void main(String[] args) {
			BankAccount bankAccount1 = new BankAccount(101,"Pravendra",22000,AccountType.Savings);
			bankAccount1.displayTotalBalance();
			bankAccount1.withdrawAmount(10000);
			bankAccount1.displayTotalBalance();
			BankAccount bankAccount2 = new BankAccount(102,"Siddharth",4000,AccountType.Current);
			bankAccount2.getCurrentBalance();
			bankAccount1.displayTotalBalance();
			}
	}