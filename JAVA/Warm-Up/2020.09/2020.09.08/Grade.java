public class Grade {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String grade = "����̾簡";
		int i;
		
/*
		//if-elseif��
		if (0 < num && num < 101){

			System.out.print("�Է��Ͻ� �� "+ num +"���� ");

			if (num >= 90) {
				i=0;
			}
			else if (num >= 80) {
				i=1;
			}
			else if (num >= 70) {
				i=2;
			}
			else if (num >= 60) {
				i=3;
			}
			else {
				i=4;
			}
			System.out.println(grade.charAt(i)+" �Դϴ�");
		}
		
		else System.out.println("1~100�� ������ ������ �Է����ּ���.");

*/

		//switch-case��
		if (0 < num && num < 101){

			System.out.print("�Է��Ͻ� �� "+num+"���� ");

			switch (num/10){
				case 10:
				case 9:
					i = 0;
					break;

				case 8:
					i = 1;
					break;

				case 7:
					i = 2;
					break;

				case 6:
					i = 3;
					break;

				default:
					i = 4;
					break;
			}
			System.out.println(grade.charAt(i)+" �Դϴ�");
		} 
		
		else System.out.println("1~100�� ������ ������ �Է����ּ���.");


	}//main
	

}//class

