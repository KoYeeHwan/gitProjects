package testProject;

public class BankAccountPO {
	int balance = 0;	
	String name;
	

	public BankAccountPO( int money) {
		balance = money;
	}
	public BankAccountPO(int money, String n) {
		balance = money;	
		name = n;
		
	}
	public BankAccountPO() {
		balance = 0;		
	
	}	
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
		
	public void checkMyBalance() {
		System.out.print("잔액" + balance);		
	}
		
	
	
}
