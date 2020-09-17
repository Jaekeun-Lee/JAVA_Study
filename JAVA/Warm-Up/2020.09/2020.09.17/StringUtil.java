
public class StringUtil {

	private static String replaceString(String[] arr) {

		int cnt = 0;
		int maxcnt = 1;
		String str ="";

		// �迭 �ϳ��� Ž�� �� a�� ���� ���� �� �ε��� maxcnt�� ����
		for (int i = 0; i < arr.length; i++) {
			if (cnt > maxcnt) {
				maxcnt = i-1;
			}
			cnt = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'a') {
					cnt++;
				}
			}
		}
		
		// a ==> A�� ����
		for (int i = 0; i < arr[maxcnt].length(); i++) {
			str += (arr[maxcnt].charAt(i)=='a')? 'A': arr[maxcnt].charAt(i);
		}

		// String.replace() ���
		//return arr[maxcnt].replace('a', 'A');
		
		return str;
	}

	public static void main(String[] args) {
		String[] arr = { "java program", "array", "java program area", "append"};
		String result = StringUtil.replaceString(arr);
		System.out.println("����� ���ڿ� ==> " + result);
	}

}
