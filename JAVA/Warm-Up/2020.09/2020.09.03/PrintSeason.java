import java.util.Scanner;

public class PrintSeason {

	public void printSeason(int num) {
		if (!(0 < num && num < 13)) {
			System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�.");
		}
		else if (3<=num && num<=5) {
			System.out.println("���� �¾�̳׿�.");
		}
		else if (6<=num && num<=8) {
			System.out.println("������ �¾�̳׿�.");
		}
		else if (9<=num && num<=11) {
			System.out.println("������ �¾�̳׿�.");
		}
		else if (num==1||num==2||num==12) {
			System.out.println("�ܿ￡ �¾�̳׿�.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ ���� �Է����ּ��� : ");
		int month = sc.nextInt();
		sc.close();
		
		new PrintSeason().printSeason(month);
		
	}

}
