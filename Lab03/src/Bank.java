import java.util.ArrayList;

class Bank {

	private ArrayList<Account> accounts = new ArrayList<Account>();
	public String createAccount(long acctNumber, double balance, String cName) {
		Customer customer = new Customer();
		customer.setCustomerName(cName);
		Account account = new Account(acctNumber, balance, customer);
		accounts.add(account);
		return "Account succesful]y added...!!";
	}
	Account isExists(long acctNumber) {
		boolean check = false;
		for (int i = 0; i < accounts.size(); i++) {
			Account temp = accounts.get(i);
			if (temp.getAccountNumber() == acctNumber) {
				check = true;
				return temp;
			}
		}
		if (check == false)
			return null;
		return null;
	}

	public String deposit(long acctNumber, double amount) {
		Account temp = isExists(acctNumber);
		if (temp != null) {
			temp.deposit(amount);
			return amount + " Added Successfully...! ";
		} else
			return "Please Enter proper account number...!";
	}

	public String withdraw(long acctNumber, double amount, double fee) {
		Account temp = isExists(acctNumber);
		if (temp != null) {
			temp.withdraw(amount, fee);
			return "Amount is withdrawn...!";
		} else
			return "Please Enter proper account number...!";
	}

	public String deleteAccount(long acctNumber) {
		Account temp = isExists(acctNumber);
		if (temp != null) {
			accounts.remove(temp);
			return "Success...!";
		} else
			return "Please Enter proper account number...!";
	}
}
