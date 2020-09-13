import java.util.Arrays;
/*

 1. �������� (SelectionSort) : ��ü ���ҵ� �߿��� ���� ��ġ�� �´� ���Ҹ� �����Ͽ� �ڸ��� ��ȯ�ϴ� ���
 2. ���� ����(BubbleSort) : ������ �ΰ��� ���Ҹ� ���Ͽ� �ڸ��� ��ȯ�ϴ� ������� ���� (���������� ������ ������ ��� ���Ѵٴ� ����)
 3. ���� ����(InsertionSort) : ���ĵǾ� �ִ� �κ����տ� ���ο� ������ ��ġ�� ã�� �����ϴ� ���Ĺ��
 
 */

 //Bean Class
public class Sorting {

	///Field
	private int size;


	///Method
	protected void selectionSort(int[] arr) {

		int min;
		int temp;
		size = arr.length;

		System.out.println("\n���� ���� ����\n\n");
		for (int i = 0; i < size - 1; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

			System.out.print((i + 1) + "�� ���� ��� = [ ");
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println("]");
		}

		System.out.println("\n���� ������ �Ϸ��Ͽ����ϴ�.");
		System.out.print("==> ���ĵ� �迭 = [ ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("]");

	}

	protected void bubbleSort(int[] arr) {
		size = arr.length;
		int temp;

		System.out.println("\n���� ���� ����\n\n");
		for (int i = 0; i < size - 1; i++) {
			for (int j = 1; j < size - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.print((i + 1) + "�� ���� ��� = [ ");
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println("]");
		}

		System.out.println("\n���� ������ �Ϸ��Ͽ����ϴ�.");
		System.out.print("==> ���ĵ� �迭 = [ ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("]");


	}

	protected void insertionSort(int[] arr) {
		int temp;
		size = arr.length;

		System.out.println("\n���� ���� ����\n\n");
		for (int i = 1; i < size; i++) {
			int j = i;
			temp = arr[i];
			while ((j > 0) && (arr[j - 1] > temp)) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
			System.out.print(i + "�� ���� ��� = [ ");
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println("]");
		}
		System.out.println("\n���� ������ �Ϸ��Ͽ����ϴ�.");
		System.out.print("==> ���ĵ� �迭 = [ ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println("]");


	}
	
	public int[] ascending(int[] arr) {
		System.out.println("\n���� ����\n\n");
		Arrays.sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			if (i != arr.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println("");
			}
		}
		System.out.println("\nSuccessful!!!!\n");
		return arr;
	}
}
