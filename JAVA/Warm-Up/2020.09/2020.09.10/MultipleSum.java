
import java.util.Scanner;
public class MultipleSum{

	public static void main(String[] args) {
		
		int number = 0;
		int count = 0;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1~1000������ ���� ������ �Է����ּ��� : ");
		number = keyboard.nextInt();
		
		for(int i=number;i<=1000;i+=number) {
			sum+=i;
			count++;
		}
		
		System.out.println("============================\n1~1000 ���̿��� ��� �� ���� �Ϸ�");
		System.out.println(number+"�� ��� ���� = "+count);
		System.out.println(number+"�� ��� �� = "+sum);
	
		keyboard.close();
	}

}
