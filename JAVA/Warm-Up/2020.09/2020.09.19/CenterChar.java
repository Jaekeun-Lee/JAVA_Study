//�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.

package programmer;

public class CenterChar {
	
	public String solution(String s) {
        String answer = "";
        int pick = s.length() / 2;
        if(s.length() % 2 == 0) {
        	answer += s.charAt(pick-1);
        	answer += s.charAt(pick);
        }
        else {
        	answer += s.charAt(pick);
        }
        return answer;
    }

	public static void main(String[] args) {
		CenterChar cc = new CenterChar();
		String s1 = "qwer";
		String s2 = "abcde";
		System.out.println("InputString : qwer\n" + cc.solution(s1) + "\nInputString : abcde\n"+cc.solution(s2));

	}

}
