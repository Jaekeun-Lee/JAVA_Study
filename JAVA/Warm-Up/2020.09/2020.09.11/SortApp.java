import java.util.Scanner;

/*

 1. �������� (SelectionSort) : ��ü ���ҵ� �߿��� ���� ��ġ�� �´� ���Ҹ� �����Ͽ� �ڸ��� ��ȯ�ϴ� ���
 2. ���� ����(BubbleSort) : ������ �ΰ��� ���Ҹ� ���Ͽ� �ڸ��� ��ȯ�ϴ� ������� ���� (���������� ������ ������ ��� ���Ѵٴ� ����)
 3. ���� ����(InsertSort) : ���ĵǾ� �ִ� �κ����տ� ���ο� ������ ��ġ�� ã�� �����ϴ� ���Ĺ��
 
 */

public class SortApp {

	public static int size;
	// �������� ( SelectionSort )
	private static void selectionSort(int[] arr) {
		// ��������
		int min;
		int temp;
		size = arr.length;
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
		System.out.println("\n=======================================");
	}

	private static void bubbleSort(int[] arr) {

		int temp;
		size = arr.length;
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
		System.out.println("\n=======================================");

	}

	private static void insertSort(int[] arr) {
		int temp;
		size = arr.length;
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
		System.out.println("\n=======================================");

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int[] arr = { 3, 24, 1, 55, 17, 43, 5 };
			System.out.print("1.��������\t2.��������\t3.��������\t | ����:-1 \n");
			System.out.print("������ �迭�� ���ҵ� : [ ");
			for (int a : arr) {
				System.out.print(a + "  ");
			}
			System.out.print("]\n���� �˰��� ���� : ");
			int inputNum = sc.nextInt();

			switch (inputNum) {
			case 1:
				selectionSort(arr);
				break;

			case 2:
				bubbleSort(arr);
				break;

			case 3:
				insertSort(arr);
				break;
			}
			if (inputNum == -1) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				sc.close();
				break;

			}

		} // while

	}// main
}
