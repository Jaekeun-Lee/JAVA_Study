
public class EvenSumOddSum {

	public void calc(int[] ix) {

		int oddSum = 0;
		int evenSum = 0;

		for (int i : ix) {
			if (i % 2 != 0)
				oddSum += i;
			else
				evenSum += i;
		}
		System.out.println("Ȧ���� �� : " + oddSum);
		System.out.println("¦���� �� : " + evenSum);

	}

	public static void main(String[] args) {
		int[] ia = { 3, 7, 1, 8, 10, 2, 15, 2, 10 };
		int[] ib = { 1, 2, 3, 4, 5 };

		EvenSumOddSum eso = new EvenSumOddSum();
		System.out.println("( �迭 ia )");
		eso.calc(ia);
		System.out.println("( �迭 ib )");
		eso.calc(ib);
	}

}
