//���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, solution�� �ϼ��ϼ���. 
//���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.

package programmers.level1;

public class StringBase {
	public boolean solution(String s) {
        boolean answer = true;
        if( s.length() == 4 || s.length() == 6) {
        	try{
        		Integer.parseInt(s);
        		return answer;
        	}catch (NumberFormatException e) {
        		return false;
        	}
        }
        else {

        	return false;
        }
    }
	
	public static void main(String[] args) {
		StringBase sb = new StringBase();
		String a = "a234";
		String b = "1234";
		String c = "12346z";
		String d = "1.2341";
		String e = "1234 5";
		
		System.out.println(sb.solution(a)+" "+sb.solution(b)+" "+sb.solution(c)+" "+sb.solution(d)+" "+sb.solution(e));
		System.out.println("F,T,F,F,F?");

	}

}
