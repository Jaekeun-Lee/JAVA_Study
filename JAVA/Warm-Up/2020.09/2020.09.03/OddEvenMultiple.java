public class OddEvenMultiple {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		
		int []num = new int[2];

		num[0] = Integer.parseInt(args[0]);
		num[1] = Integer.parseInt(args[1]);
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) { //¦���� ��
				if(num[i]%3==0) {
					System.out.println("�Է��Ͻ� "+(i+1)+"��° ���� �� "+num[i]+"�� ¦���̸� 3�� ��� �Դϴ�.");
				}
				else System.out.println("�Է��Ͻ� "+(i+1)+"��° ���� �� "+num[i]+"�� ¦���̸� 3�� ����� �ƴմϴ�.");
			}
			else if(num[i]%2!=0) {//Ȧ���� ��
				if(num[i]%3==0) {
					System.out.println("�Է��Ͻ� "+(i+1)+"��° ���� �� "+num[i]+"�� Ȧ���̸� 3�� ��� �Դϴ�.");
				}
				else System.out.println("�Է��Ͻ� "+(i+1)+"��° ���� �� "+num[i]+"�� Ȧ���̸� 3�� ����� �ƴմϴ�.");
			}
			else System.out.println("�Ǵ��Ҽ������");
		}
		
		
		
	}

}
