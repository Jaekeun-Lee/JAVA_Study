
public class Account {
	
	///Field
	String accNo;
	int balance;
	
	//Constructor
	public Account(String s) {
		this.accNo=s;
		System.out.println(s+" ���°� �����Ǿ����ϴ�.");
	}

	///Method
	//�Ա�
	public void deposit(int i) {
		this.balance+=i;
		System.out.println(this.accNo+" ���¿� "+i+"���� �Ա� �Ǿ����ϴ�.");
	}
	
	//���
	public void withdraw(int i) {
		this.balance-=i;
		System.out.println(this.accNo+" ���¿� "+i+"���� ��� �Ǿ����ϴ�.");
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public String getAccNo() {
		return this.accNo;
	}
}
