import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Bank bank = new Bank();

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		long acctNumber = 0;
		double amount = 0;
		double fees = 0;
		String cName = null;
		do {
			System.out.println("==========================================");
			System.out.println("1 - Add account");
			System.out.println("2 - Add Money");
			System.out.println("3 - Withdraw");
			System.out.println("4 - Delete account");
			System.out.println("5 - Display balance");
			System.out.println("6 - Exit");
			System.out.println("==========================================");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Account number :: ");
				acctNumber = sc.nextLong();
				System.out.print("Enter Customer Name :: ");
				cName = sc.next();
				System.out.print("Enter Money :: ");
				amount = sc.nextDouble();
				System.out.println(bank.createAccount(acctNumber, amount, cName));
				break;
			case 2:
				System.out.println("Enter Account number :: ");
				acctNumber = sc.nextLong();
				System.out.println("Enter Money to diposit :: ");
				amount = sc.nextDouble();
				System.out.println(bank.deposit(acctNumber, amount));
				break;
			case 3:
				System.out.println("Enter Account number :: ");
				acctNumber = sc.nextLong();
				System.out.println("Enter Money to withdraw :: ");
				amount = sc.nextDouble();
				System.out.println("Enter Ammount to fees :: ");
				fees = sc.nextDouble();
				bank.withdraw(acctNumber, amount, fees);
				break;
			case 4:
				System.out.println("Enter Account number for delete :: ");
				acctNumber = sc.nextLong();
				bank.deleteAccount(acctNumber);
				break;
			case 5:
				System.out.println("Enter Account number for display :: ");
				acctNumber = sc.nextLong();
				
				Account account = bank.isExists(acctNumber);
				if(account!=null)
					System.out.println("Current balance is " + account.getBalance());
				else
					break;
				break;
			case 6:
				System.exit(0);
				break;
			default:
				break;
			}

		} while (choice != 0);

	}

}
