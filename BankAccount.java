package Day7;

public class BankAccount {
	double balance;
	void deposit(double amount) {
		balance=balance+amount;
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Withdraw successful.");
			
		}else {
			System.out.println("insufficient balance.");
		}
	}
	double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount account=new BankAccount();
		account.deposit(1000);
		System.out.println("balance:" + account.getBalance());
		account.withdraw(300);
		System.out.println("balance:" + account.getBalance());

	}

}
