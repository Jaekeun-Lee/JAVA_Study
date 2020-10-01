package bill;

public class PhoneBill {

	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone("010-010-010",1000);
		
		cellPhone.call("017-017-017", 10);
		cellPhone.call("016-016-016", 10);
		cellPhone.calculationTotalFee();
		System.out.println(cellPhone.getPhoneNumber()+"�� �� ��ȭ �ð���"
				+ cellPhone.getTotalCallTime()+"�� �̸�\n"+
				"�д� ����� "+cellPhone.getFeePerCallTime()+
				"���̰� �� ����� "+cellPhone.getTotalFee()+"�� �Դϴ�.");
		
		System.out.println("===============================");
		
		SmartPhone smartPhone = new SmartPhone("000-000-000",200);
		smartPhone.call("017-017-017", 10);
		smartPhone.calculationTotalFee();
		System.out.println(smartPhone.getPhoneNumber()+"�� ��ȭ �ð���"
				+ smartPhone.getTotalCallTime()+"�� �̸�\n"+
				"�д� ����� "+smartPhone.getFeePerCallTime()+
				"���̰� �� ����� "+smartPhone.getTotalFee()+"�� �Դϴ�.");
		
		System.out.println("===============================");
		
		SmartPhone smartPhone2 = new SmartPhone("111-111-111",0,true,3000);
		smartPhone2.call("017-017-017", 10);
		smartPhone2.call("016-016-016", 10);
		smartPhone2.calculationTotalFee();
		System.out.println(smartPhone2.getPhoneNumber()+"�� ��ȭ �ð���"
				+ smartPhone2.getTotalCallTime()+"�� �̸�\n"+
				"�д� ����� "+smartPhone2.getFeePerCallTime()+
				"���̰� �� ����� "+smartPhone2.getTotalFee()+"�� �Դϴ�.");
	}

}
