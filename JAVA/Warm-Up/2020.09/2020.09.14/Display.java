
/*
 * �߻� �޼ҵ� / �߻�Ŭ������ �ʿ伺 �� ����
 * 
 * �߻�޼ҵ�
 * - ��ü���� �ʿ䰡 ���� �޼ҵ�
 * - ���� Ŭ�������� ��ü������ ������(�������̵�)�ؾ� �������� ���� �޼ҵ�
 * 
 * �߻� Ŭ����
 * - ��ü������ ���� �߻� �޼ҵ尡 ���ǵ� Ŭ����
 * - �Ϲ�ȭ�� ������ ������, �Ϲ��� ������ �Ӽ��� ������ �������� ���ǵ� Ŭ����
 * ==> �߻�Ŭ������ �ν��Ͻ� ������ �� �� ����!!!!!!!!!!!!!!! <==
 * 
 * */

abstract class BusCharge {
	/// Field
	String section;
	
	/// Constructor
	public BusCharge() {

	}

	public BusCharge(String section) {
		this.section = section;
	}

	/// Method
	public void information() {
		System.out.println("������� �ȳ�");
	}

	// ���� Ŭ������ �������̵��� �����ϴ� �߻�޼��带 �����Ѵ�.
	public abstract void charge();
}

//abstract class��ӽ� abstract method�� ���� ������(�������̵�)�ؾ��Ѵ�.
class Student extends BusCharge {
	public Student() {
		super("�л�");
	}

	// �� �Լ��� ������ �߻�Ŭ���� ��� �����ʴ´�.
	// �߻�Ŭ������ ����Ϸ��� �߻�޼ҵ带 ������ �������̵��ؾ��Ѵ�!!!!!!!!!!!!!!!!!!!!!!
	public void charge() {
		System.out.println("::300��");
	}
}

//abstract class��ӽ� abstract method�� ���� ������(�������̵�)�ؾ��Ѵ�.
class Adult extends BusCharge {
	public Adult() {
		super("�Ϲ���");
	}

	// �� �Լ��� ������ �߻�Ŭ���� ��� �����ʴ´�.
	// �߻�Ŭ������ ����Ϸ��� �߻�޼ҵ带 ������ �������̵��ؾ��Ѵ�!!!!!!!!!!!!!!!!!!!!!!
	public void charge() {
		System.out.println("::500��");
	}
}

//abstract class��ӽ� abstract method�� ���� ������(�������̵�)�ؾ��Ѵ�.
class Old extends BusCharge {
	public Old() {
		super("����");
	}

	// �� �Լ��� ������ �߻�Ŭ���� ��� �����ʴ´�.
	// �߻�Ŭ������ ����Ϸ��� �߻�޼ҵ带 ������ �������̵��ؾ��Ѵ�!!!!!!!!!!!!!!!!!!!!!!
	public void charge() {
		System.out.println("::��¥");
	}
}

public class Display {

	public static void main(String[] args) {
		/*
		 
		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.print(b1.section);
		b1.charge();//� Ŭ������ �޼ҵ尡 ȣ��Ǿ����� Ȯ��
		
		b2.information();
		System.out.print(b2.section);
		b2.charge();//� Ŭ������ �޼ҵ尡 ȣ��Ǿ����� Ȯ��
		
		b3.information();
		System.out.print(b3.section);
		b3.charge();//� Ŭ������ �޼ҵ尡 ȣ��Ǿ����� Ȯ��
		
		//�߻�Ŭ������ ��ü ������ �Ұ��ϴ�.
		//BusCharge bc01=new BusCharge();
		
		//��ü ������ �Ұ��������� ������ ����(������Ÿ��)�� �����ϴ�.
		//BusCharge bc02;
		 
		 
		*/
		
		
		//���� ���۷����� ���� �ν��Ͻ��� ��������(������ ����ȯ) is~a����
		BusCharge bc1=new Student();
		BusCharge bc2=new Adult();
		BusCharge bc3=new Old();
		//==> Polymorphism : �ϳ��� �������̽��� ���� �� �پ��� Ȱ��
		
		bc1.information();
		System.out.print(bc1.section);
		bc1.charge();
		
		bc2.information();
		System.out.print(bc2.section);
		bc2.charge();
		
		bc3.information();
		System.out.print(bc3.section);
		bc3.charge();
		
		System.out.println("=======================");
		
		BusCharge[] bc = new BusCharge[3];
		bc[0]=new Student();
		bc[1]=new Adult();
		bc[2]=new Old();
		
		for(int i=0;i<bc.length;i++) {
			bc[i].information();
			System.out.println(bc[i].section);
			bc[i].charge();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
