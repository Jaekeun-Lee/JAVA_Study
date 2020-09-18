/* ������ ó�� ���´� ������ �־��� ���ÿ� �����ϴ�. 
 * ũ������ [1, 5, 3, 5, 1, 2, 1, 4] �� ��ġ���� ���ʴ�� ������ ��� �ٱ��Ͽ� �Ű� ���� ��, 
 * ���´� �Ʒ� �׸��� ������ �ٱ��Ͽ� ��� �������� ��Ʈ���� ����� ������ 4�� �Դϴ�.*/

package programmer;
import java.util.Stack;

public class ClawCraneGame {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<Integer>();
		for(int i=0; i<moves.length; i++) {
			int col = moves[i]-1;
			for(int row=0; row<board.length; row++) {
				if(board[row][col] != 0) {		// ������ ����ִ°�� -> �ش� ���� �ֱ�
					if(basket.isEmpty()) basket.push(board[row][col]);
					else {		// ������ ������� ���� ��� 
						if(basket.peek() == board[row][col]) {
							basket.pop();	//������ �����ϸ� pop()
							answer += 2;
						}
						else {								//������ �������� ������ 
							basket.push(board[row][col]);	//���ÿ� ���� �ֱ�
						}
					}
					board[row][col] = 0;	//������ ���� board[][]�� 0���� �����.
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int [][] board = { 	{ 0, 0, 0, 0, 0 }, 
							{ 0, 0, 1, 0, 3 }, 
							{ 0, 2, 5, 0, 1 }, 
							{ 4, 2, 4, 4, 2 },
							{ 3, 5, 1, 3, 1 } 	};
		
		int [] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		ClawCraneGame ccg = new ClawCraneGame();
		int result = ccg.solution(board, moves);
		System.out.println(result);
	}

}
