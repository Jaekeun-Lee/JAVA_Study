import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int year = sc.nextInt();
		int month = 2;
		int maxDay = 28;
		// �⵵�� 4�� ������ �������鼭 100���� ������ �ʰ� ���߿� 400���� ���������� ����
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			maxDay++;
			System.out.println(year + "�⵵�� �����̰�, " + month + "���� ������ " + maxDay + "�� �Դϴ�.");
		} else
			System.out.println(year + "�⵵�� ����̰�, " + month + "���� ������ " + maxDay + "�� �Դϴ�.");

		sc.close();
	}

}
