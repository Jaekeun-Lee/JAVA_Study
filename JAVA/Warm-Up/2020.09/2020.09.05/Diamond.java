import java.util.Scanner;

// �Է� ���ڰ� �߾����� �Ǵ� ���̾Ƹ��
public class Diamond {

	// ��� ~ �߾ӱ��� �ﰢ��
	public static void draw(int num) {
		
		for (int i = num,count = 1; i > 0; i -= 2,count += 2) {

			// ���� ����
			for (int j = 1; j <= (i / 2); j++) {
				System.out.print(" ");
			}

			// �� ���
			for (int star = 0; star < count; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 1,count=num-2; i <= num; i += 2,count-=2) {

			// ���� ����
			for (int j = 1; j <= i; j += 2) {
				System.out.print(" ");
			}

			// �� ���
			for (int star = 0; star < count; star++) {
				System.out.print("*");
			}

			
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̾Ƹ�� �߾����� ���� ���� �Է�(Ȧ����) : ");
		int num = sc.nextInt();

		// ��ȿ�� �˻�
		if (num % 2 == 0) {
			System.out.println("Ȧ���� �Է����ּ���.");
		}

		else { // draw Method
			draw(num);

		}

		sc.close();
	}

}
