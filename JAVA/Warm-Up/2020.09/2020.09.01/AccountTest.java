
public class AccountTest {

	public static void main(String[] args) {
		
		String accNo=null;
		int balance = 0;
		
		Account accObj = new Account("111-2222-333");
		accNo=accObj.getAccNo();
		balance = accObj.getBalance();
		System.out.println(accNo+" ������ �ܰ�� "+balance+"�� �Դϴ�.");
		System.out.println("========================");
		
		accObj.deposit(100);
		balance=accObj.getBalance();
		System.out.println(accObj.getAccNo()+" ������ �ܰ�� "+balance+"�� �Դϴ�.");
		System.out.println("========================");
		
		accObj.withdraw(30);
		balance=accObj.getBalance();
		System.out.println(accNo+" ������ �ܰ�� "+balance+"�� �Դϴ�.");
		
	}

}
