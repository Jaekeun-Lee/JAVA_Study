
public class Sum {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum=0;
		int temp;
		

		if (num1>num2){

			temp = num1;
			num1=num2;
			num2=temp;
			
		}
		else if (num1==num2){
			System.out.println("�Է� ���� �����ϴ� \n[usage]:: �� ���ڸ� �ٸ��� �Է����ּ���.");
			//System.exit(0); // C����� return 0�� ���� ���
			return;
		}

		for(int i =num1;i<=num2;i++) {
			sum+=i;
		}
		System.out.println(num1+" ~ "+num2+"������ �հ� : "+sum);

	}

}
