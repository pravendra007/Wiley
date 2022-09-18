
public class BankAccount {
	
	int accountId;
	String accountHolderName;
	BankAccountType accountType;
	
	public BankAccount(int accountId, String accountHolderName, BankAccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
	}
	
	public double calculateTotalInterest(double amount,int years) throws DepositAmountException {
		
		if(amount<0)
			throw new DepositAmountException("Amount cannot be neagtive");
		int rate=accountType.getInterestRate();
		
		return (amount*rate*years)/100;
	}
}
