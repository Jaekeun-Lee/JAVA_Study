import java.util.ArrayList;
import java.util.Scanner;

public class VarietyValueUsingIntArray {

	private static void calc(ArrayList<Integer> al) {
		int total = 0;
		double average = 0.0;

		for (int i = 0; i < al.size(); i++) {
			total += al.get(i);
		}

		average = (double) total / al.size();
		al.sort(null);

		System.out.println("The largest value = " + al.get(al.size() - 1));
		System.out.println("The smallest value = " + al.get(0));
		System.out.println("The total value = " + total);
		System.out.println("The average value = " + average);

	}

	public static void main(String[] args) {

		int cnt = 1;
		int test = 0;

		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("�Է��� ������ largest / smallest / sum / average ���ϱ�"
				+ "\n====================================================\n" + "������ �Է����ּ��� ( �Է¿Ϸ�� ' -1 ' )");

		// ���� �ϳ��� �Է¹ް� ArrayList�� ���
		while (true) {
			System.out.print(cnt + "��° ���� �Է� = ");
			test = sc.nextInt();
			if (test == -1)
				break;
			else if (test < 0 || test > 9999) {
				System.out.println("0~9999������ ������ �Է����ּ���.");
				cnt--;
			} else
				al.add(test);
			cnt++;

		}
		sc.close();

		System.out.println("�Է� ���� �� ==>" + al);

		calc(al);
	}
}
