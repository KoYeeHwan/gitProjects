package testProject;

public class MainStart {
	 {
		BankAccountPO choi1 = new BankAccountPO();
		BankAccountPO choi2 = new BankAccountPO(1000);
		BankAccountPO choi3 = new BankAccountPO(1000, "지원");
		choi3.deposit(1000);		
		
		choi3.checkMyBalance();
		
	}
}
