import java.util.Scanner;
public class SortUtil {


	public static void main(String[] args) {

		Sorting sorting = new Sorting();
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			int[] numbers = new int[] { 7, 5, 2, 19, 34, 51, 32, 11, 67, 21 };
			System.out.println(" \n\n================================================================================================\n");
			System.out.print("\t 1.�������� \t 2.�������� \t 3.�������� \t 4.Arrays.sort()      ���� : -1 \n");
			System.out.println(" \n================================================================================================\n");
			System.out.print("������ �迭�� ���ҵ� : [ ");
			for (int a : numbers) {
				System.out.print(a + "  ");
			}
			System.out.print("]\n\n���� �˰��� ���� : ");
			int inputNum = sc.nextInt();

			switch (inputNum) {
			
			// 1. Selection Sort
			case 1:		
				sorting.selectionSort(numbers);
				break;

			//2. Bubble Sort
			case 2:		
				sorting.bubbleSort(numbers);
				break;

			//3. Insertion Sort
			case 3:		
				sorting.insertionSort(numbers);
				break;
			
			//4. Arrays.sort �����Լ�
			case 4:
				sorting.ascending(numbers);
				break;
			}
			if (inputNum == -1) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				sc.close();
				break;

			}
		
	}

	}}
