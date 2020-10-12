 
import java.util.Scanner;

public class RecordGrade {

	public static char checkGrade(double avg) {
		char c = 'F';
		switch ((int) avg / 10) {
			case 10:
			case 9:
				c = 'A';
				break;
	
			case 8:
				c = 'B';
				break;
	
			case 7:
				c = 'C';
				break;
	
			case 6:
				c = 'D';
				break;
		}

		return c;

	}

	public static void main(String[] args) {
		String stdNum = "";
		int kor = 0;
		int math = 0;
		int eng = 0;
		int java = 0;
		int sum = 0;
		double avg = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("�й��� �Է����ּ��� : ");
		stdNum = sc.nextLine();

		System.out.print("���� ������ �Է����ּ��� : ");
		kor = sc.nextInt();

		System.out.print("���� ������ �Է����ּ��� : ");
		math = sc.nextInt();

		System.out.print("���� ������ �Է����ּ��� : ");
		eng = sc.nextInt();

		System.out.print("�ڹ� ������ �Է����ּ��� : ");
		java = sc.nextInt();

		sc.close();

		sum = kor + math + eng + java;
		avg = sum / 4.0;
		System.out.println("---------------------");
		System.out.println("�й� : " + stdNum);
		System.out.println("---------------------");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
		System.out.println("���� : " + eng);
		System.out.println("�ڹ� : " + java);
		System.out.println("---------------------");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + RecordGrade.checkGrade(avg));
		System.out.println("---------------------");

	}

}
