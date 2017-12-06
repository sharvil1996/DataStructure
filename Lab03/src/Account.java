class Account {

	private long acctNumber;
	private double balance;
	private Customer customer;

	public Account(long acctNumber, double balance, Customer customer) {

		this.acctNumber = acctNumber;
		this.balance = balance;
		this.customer = customer;
	}

	
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	
	

	public void withdraw(double amount, double fee) {
		if (amount > balance)
			System.out.println("Please Enter Proper Amount...!");
		else {
			balance -= amount + fee;
		}
	}

	public double getBalance() {
		return balance;
	}

	public long getAccountNumber() {

		return acctNumber;
	}

}
