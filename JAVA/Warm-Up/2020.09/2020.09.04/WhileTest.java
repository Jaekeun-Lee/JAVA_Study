
public class WhileTest {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println("While ���� print i=" + i);
			i++;
		}

		int j = 0; // ��ȯ���� ������ �ֱ����� j�ʱ�ȭ
		do {
			System.out.println("\n\tdo�� ���� j=" + j);
			j++; // ������
		} while (j < 1);// ����(boolean data type)

		System.out.println("===================");

		int k = 1;
		while (k < 10) {
			System.out.println("5 * " + k + " = " + 5 * k);
			k++;
		}

		// while(true) { System.out.println("���ѷ���"); }
	}

}
