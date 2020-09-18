//����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�. 
//2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
package programmer;

public class MatrixAdd {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		MatrixAdd ma = new MatrixAdd();
		int[][] a = { { 1, 2 }, 
					  { 2, 3 } };
		
		int[][] b = { { 3, 4 }, 
					  { 5, 6 } };
		
		System.out.println(ma.solution(a, b));

	}

}
