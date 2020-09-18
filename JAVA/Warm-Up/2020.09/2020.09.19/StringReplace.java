package bitcamp015;

public class StringReplace {

	public static String myReplace(String str, char oldChar, char newChar) {
		// replace method ���
		//return str.replace(oldChar, newChar);
		
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr += (str.charAt(i) == oldChar) ? newChar : str.charAt(i);
		}
		
		return newStr;
		
	}

	public static void main(String[] args) {

		System.out.println("���ڿ��� Ư�� ���� �����ϴ� �׽�Ʈ");
		System.out.println("=======================Sample1=======================");
		System.out.println(myReplace("hello world", 'l', '*'));

		System.out.println("=======================Sample2=======================");
		System.out.println(myReplace("hello world", ' ', '-'));

		System.out.println("=======================Sample3=======================");
		System.out.println(myReplace("hello world", 'a', '*'));
	}

}
