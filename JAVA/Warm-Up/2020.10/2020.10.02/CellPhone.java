
public class CellPhone {

	/// Field
	String model;
	double battery;

	/// Constructor
	public CellPhone() {
	}

	public CellPhone(String model) {
		super();
		this.model = model;
	}

	/// Method
	public void call(int callingTime) throws IllegalArgumentException {

		if (callingTime < 0) {
			throw new IllegalArgumentException("�Է°� : " + callingTime + " ==> ��ȭ �ð� �Է� ����");
		} else {
			// ��ȭ �ð� ���
			System.out.println("��ȭ�ð� : " + callingTime + "��");

			// ���͸� ���� ( ��ȭ�ð�*0.5 , but 0���� �۾����� �ʴ´�. )
			this.battery = (this.battery - callingTime * 0.5 > 0) ? this.battery - callingTime * 0.5 : 0;
		}

	}

	public void charge(int chargingTime) throws IllegalArgumentException {

		if (chargingTime < 0) {
			throw new IllegalArgumentException("�Է°� : " + chargingTime + " ==> ���� �ð� �Է� ����");
		} else {
			// ���� �ð� ���
			System.out.println("�����ð� : " + chargingTime + "��");

			// ���͸� ���� ( ���͸�=�����ð� * 3, but 100���� Ŀ���� �ʴ´�. )
			this.battery = (this.battery + chargingTime * 3 <= 100) ? this.battery + chargingTime * 3 : 100;
		}
	}

	public void printBattery() {
		System.out.println("���� ���͸��� : " + (int)this.battery +"%");
	}

	public boolean equals(Object otherObject) {

		if (!(otherObject instanceof CellPhone)) {
			return false;
		} else {
			return model.equals(((CellPhone) otherObject).model);
		}

	}

}
