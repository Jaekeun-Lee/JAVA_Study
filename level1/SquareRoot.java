/*
������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

				��
				n		return
				121		144
				3		-1
*/


package programmers.level1;
import java.lang.Math;

public class SquareRoot {
	public long solution(long n) {
        long answer = 0;
        double base = Math.sqrt(n);
        if ( base % 1 > 0 ) {
        	answer = -1;
        }
        else answer = (long) Math.pow(base+1, 2);
        return answer;
    }
	public static void main(String[] args) {
		SquareRoot sr = new SquareRoot();
		System.out.println(sr.solution(121));
	}

}
