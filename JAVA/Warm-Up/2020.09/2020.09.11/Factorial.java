import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {

		if (n <= 2) {
			return n;
		} else {
			return n * fact(n - 1);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		/*
		//1. for�� �̿�
		int result = 1 ;
		
		if (1 < num && num < 10) {
			for (int i=1; i<=num;i++) {
				result*=i;
				System.out.println(i+"! = "+result);
			}
		}else
			System.out.println("1���� ũ�� 10���� ���� ������ �Է��ؾ��մϴ�...");
		*/
		
		
		
		//2. ��� �Լ�
		if (1 < num && num < 10) {
			System.out.println(num + "! = " + fact(num));
		} else
			System.out.println("1���� ũ�� 10���� ���� ������ �Է��ؾ��մϴ�...");
				
		sc.close();
	}

	
}
