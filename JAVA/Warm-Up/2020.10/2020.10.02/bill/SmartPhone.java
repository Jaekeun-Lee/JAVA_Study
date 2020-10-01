package bill;

public class SmartPhone extends CellPhone {

	/// Field
	private boolean signUp;
	private int planPrice;

	/// Constructor
	public SmartPhone() {

	}

	public SmartPhone(String newPhoneNumber, int newFeePerCallTime) {
		super.setPhoneNumber(newPhoneNumber);
		super.setFeePerCallTime(newFeePerCallTime);
	}

	public SmartPhone(String newPhoneNumber, int newFeePerCallTime, boolean signUp, int planPrice) {
		super.setPhoneNumber(newPhoneNumber);
		super.setFeePerCallTime(newFeePerCallTime);
		this.signUp = signUp;
		this.planPrice = planPrice;
		
		if(signUp) {
			super.setTotalFee(planPrice);
		}
	}
	
	///Method
	@Override
	public void calculationTotalFee() {
		if(signUp) {
			System.out.println("������ "+this.planPrice+" ���� ����� �Դϴ�.");
		}else {
			super.calculationTotalFee();
		}
	}

}
