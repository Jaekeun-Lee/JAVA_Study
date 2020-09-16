package bitcamp013.homework;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		int limit;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("���ڸ� �Է����ּ��� : ");
			limit = sc.nextInt();

			if (limit > 1)
				break;
			else
				System.out.println("1�̻��� ���ڸ� �Է����ּ���.");

		}
		sc.close();
		Util util = new Util();

		int primeCount = util.findPrimeCount(limit);
		System.out.println("1 ~ " + limit + "������ �Ҽ� ������ " + primeCount + "EA ");

		int[] primeArray = util.findPrimeReturnArray(limit);
		System.out.print("PrimeList ==> [ ");
		for (int i = 0; i < primeArray.length; i++) {
			System.out.print(primeArray[i] + ((primeArray.length - 1) != i ? "," : ""));
		}
		System.out.println(" ]");
	}

}
