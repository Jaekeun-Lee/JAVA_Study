/*
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.*/


package programmers.level1;

public class ParseInt {
	
	public int solution(int n) {
        int answer = 0;
        
        String s = Integer.toString(n);
        for (int i = 0 ; i < s.length(); i++) {
        	answer += Integer.parseInt(s.charAt(i)+"");
        }
        return answer;
    }
	
	public static void main(String[] args) {
		ParseInt pi = new ParseInt();
		
		int a = pi.solution(123);
		System.out.println(a);
		

	}
}
