 
public class Account {

	/// Field
	private String accountNo;
	private boolean creditLine;
	private int creditLineLimit; // ���̳ʽ� �ݾ��ѵ�
	private int balance;

	/// Constructor
	public Account() {
		super();
		this.accountNo = null;
		this.creditLine = false;
		this.creditLineLimit = 0;
		this.balance = 0;
	}

	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		super();
		this.accountNo = accountNo;
		this.creditLine = creditLine;
		this.creditLineLimit = -creditLineLimit;
		this.balance = balance;
	}

	/// Method
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = -creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) throws Exception {
		// ���̳ʽ� ����
		if (creditLine) {
			if ((this.balance -= money) < this.creditLineLimit) {
				throw new Exception("�ܰ� �����Ͽ� ����� �Ұ����մϴ�.");
			}

			// ���̳ʽ� ���� X
		} else {
			if ((this.balance -= money) < 0) {
				throw new Exception("�ܰ� �����Ͽ� ����� �Ұ����մϴ�.");
			}
		}
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();

		if (this.accountNo == null) {
			builder.append("���� ������ �ʿ��մϴ�.");
		} else {
			builder.append("���� ��ȣ : ");
			builder.append(this.accountNo);
			builder.append(", �ܰ� : ");
			builder.append(this.balance);
			builder.append("��");
			if (this.creditLine) {
				builder.append("\t[[ ");
				builder.append(this.creditLineLimit);
				builder.append("�� ���̳ʽ� �����Դϴ�. ]]");
			}
		}
		return builder.toString();
	}

}
