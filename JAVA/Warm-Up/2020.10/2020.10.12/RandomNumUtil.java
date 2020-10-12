package iopractice;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class RandomNumUtil implements AutoCloseable{

	// 10���� ���� �����Ͽ� �迭�� ����
	private static int[] generateRandomNumber() {

		// ���� �˰����� �����ϱ� ���� ���� �� = Seed
		// Seed�� ����ð����� �����Ͽ� ����
		Random rand = new Random(System.currentTimeMillis());

		int[] randomNumArr = new int[10];

		for (int i = 0; i < randomNumArr.length; i++) {
			randomNumArr[i] = rand.nextInt(20) + 1; // 0���� 19���� �����ϱ� +1�ؼ� ����
			if (i > 0) { // �ߺ��� ��
				for (int j = 0; j < i; j++) {
					if (randomNumArr[i] == randomNumArr[j]) {
						i--; // �ߺ��Ǹ� �ٽù���
					}
				}
			}
		}

		return randomNumArr;
	}

	// �߻��� ������ ��������� store.txt ���Ͽ� ���
	public static void printStatistics(int[] array) {
		
		// 1.try-with-resource
		try(BufferedWriter bw= new BufferedWriter(new FileWriter("store2.txt"))){
			double sum = 0;
			for (int a : array) {
				sum += a;
				bw.write(a + "");
				bw.newLine();
			}

			Arrays.sort(array);

			bw.write("�ִ밪 : " + array[array.length - 1] + "\n");
			bw.write("�ּҰ� : " + array[0] + "\n");
			bw.write("��հ� : " + sum / array.length + "\n");
		}catch(IOException e){
	        e.printStackTrace(); 
	    }
		
/*
		// 2.try-catch-finally
		BufferedWriter bw = null;

		try {

			bw = new BufferedWriter(new FileWriter("store.txt"));
			double sum = 0;
			for (int a : array) {
				sum += a;
				bw.write(a + "");
				bw.newLine();
			}

			Arrays.sort(array);

			bw.write("�ִ밪 : " + array[array.length - 1] + "\n");
			bw.write("�ּҰ� : " + array[0] + "\n");
			bw.write("��հ� : " + sum / array.length + "\n");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		} finally {
			try {
				bw.flush();
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
*/
	}
	@Override
	public void close() throws Exception {

	}
	
	public static void main(String[] args) {

		int[] array = generateRandomNumber();
		printStatistics(array);
		System.out.println("Successfully Save !");

	}

	

}
