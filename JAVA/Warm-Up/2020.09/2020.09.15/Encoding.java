import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		//String sourceString = "everyday we have is one more than we deserve";
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("����� ������ �Է����ּ��� : ");
		String sourceString = sc.nextLine();
		sc.close();
		
		String encodedString ="";
		int ascii;
		
		for (int i = 0; i < sourceString.length(); i++) {
			ascii = sourceString.charAt(i);
			if(sourceString.charAt(i)==' ') {
				encodedString+=' ';
			}else {
				ascii+=3;
				if(ascii>122) {
					ascii-=26;
				}
				encodedString+=(char)ascii;
			}
			
			
		}
		
		
		System.out.println("��ȣȭ �� ���ڿ� = "+ sourceString);
		System.out.println("��ȣȭ �� ���ڿ� = "+encodedString);
	}

}
