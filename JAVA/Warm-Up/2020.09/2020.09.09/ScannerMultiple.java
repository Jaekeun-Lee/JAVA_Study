import java.util.Scanner;
public class ScannerMultiple {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� : ");
		
		int inputInt = keyboard.nextInt();
		
		if(1<inputInt && inputInt<10) {
			for(int i =1; i<10;i++) {
				System.out.println(inputInt+" * "+i+" = "+(inputInt*i));
			}
		}
		else System.out.println("�߸��� ���ڰ� �Է� �Ǿ����ϴ�.");
		
		keyboard.close();
	}

}
