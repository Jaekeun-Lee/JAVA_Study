package bitcamp013.homework;

import java.util.ArrayList;

public class Util {
	public int findPrimeCount(int limit) {
		int cnt = 1; // �Ҽ� '2'�� �����ϰ� ����

		for (int i = 2; i <= limit; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					break; // ���������� �������ڷ�
				else if (j == (i - 1))
					cnt++; // �Ҽ��� ī��Ʈ++
			}
		}
		return cnt;

	}

	public int[] findPrimeReturnArray(int limit) {

		// �Ҽ� ã���鼭 ����� ArrayList����
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(2); // �ʱⰪ 2 �߰�

		// limit������ �Ҽ� ���ϱ�
		for (int i = 2; i <= limit; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					break; // ���������� �������ڷ�
				else if (j == (i - 1)) {
					temp.add(i);
				}
			}
		}

		// ���� �迭 ����
		int[] returnArr = new int[temp.size()];

		// ArrayList -> �迭�� �ű��
		for (int i = 0; i < temp.size(); i++) {
			returnArr[i] = temp.get(i);
		}

		return returnArr;
	}
}
