public class BankAccount {
	int accountId;
	String accountHolderName;
	double openingBalance, currentBalance;
	static double totalBalance = 0.0;
	AccountType acc = null;
	int v = 0;

	public BankAccount(int accountId, String accountHolderName, double openingBalance) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.openingBalance = openingBalance;
		totalBalance += openingBalance;
		this.currentBalance = openingBalance;

	}

	public BankAccount() {
		this.currentBalance = 0.0;

	}

	public BankAccount(int accountId, String accountHolderName, double openingBalance, AccountType acc) {
		if ((acc == AccountType.Current && openingBalance >= 1000)
				|| (acc == AccountType.Savings && openingBalance >= 500)) {
			this.accountId = accountId;
			this.accountHolderName = accountHolderName;
			this.openingBalance = openingBalance;
			totalBalance += openingBalance;
			this.currentBalance = openingBalance;
			this.acc = acc;
		} else {
			System.out.println(" Account cannot be created due to insufficient opening balance");
			v = 1;
		}

	}

	public void depositAmount(double amount) {
		if (v == 0) {
			currentBalance += amount;
			totalBalance += amount;
			System.out.println("Amount Deposited succesfully");
		} else {
			System.out.println("Account not created");
		}
	}

	public void withdrawAmount(double amount) {
		if (v == 0) {
			currentBalance -= amount;
			if ((acc == AccountType.Current && currentBalance >= 1000)
					|| (acc == AccountType.Savings && currentBalance >= 500) || (acc == null)) {
				System.out.println("Amount Withdrawn");
				totalBalance -= amount;
			} else {
				System.out.println("Insufficient Balance Amount not Withdrawn");
			}
		} else {
			System.out.println("Account not created");
		}
	}

	public void displayTotalBalance() {
		if (v == 0) {
			System.out.println("Total amount of bank =" + totalBalance);
		} else {
			System.out.println("Account not created");
		}
	}

	public void getCurrentBalance() {
		if (v == 0) {
			System.out.println("The current balance =" + currentBalance);
		} else {
			System.out.println("Account not created");
		}
	}
}