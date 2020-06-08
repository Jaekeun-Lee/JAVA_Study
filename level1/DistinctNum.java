/*
�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
�̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
*/
package programmers.level1;

import java.util.ArrayList;

public class DistinctNum {

	public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
		int temp = -1;
        
        for (int i = 0; i < arr.length; i++) {
        	if (temp != arr[i]) {
        		answer.add(arr[i]);
        		temp = arr[i];
        	}
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
	
	public static void main(String[] args) {
		DistinctNum dn = new DistinctNum();
		
		int [] arr1 = {1, 1, 3, 3, 0, 1, 1};
		int [] arr2 = {4, 4, 4, 3, 3};
		System.out.print("Input arr1 => ");
		for(int a : dn.solution(arr1)) {
			System.out.print(a);
		}
		System.out.print("\nInput arr2 => ");
		for(int a : dn.solution(arr2)) {
			System.out.print(a);
		}


	}

}
