package iopractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class FileCalculatorUsingReaderWriter {

	public void addCalculateResult(String inputFileName) throws Exception {

		int sum = 0;
		int mul = 1;
		int temp = 0;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			br = new BufferedReader(new FileReader(inputFileName));
			bw = new BufferedWriter(new FileWriter(inputFileName, true));
			ArrayList<Integer> al = new ArrayList<Integer>();

			al.add(Integer.parseInt(br.readLine()));

			while (!al.isEmpty()) { // ������ loop
				temp = al.get(0);
				sum += temp;
				mul *= temp;
				try {
					al.add(Integer.parseInt(br.readLine()));
					al.remove(0);
				} catch (NumberFormatException e) {
					break;
				}
			}

			bw.newLine();
			bw.write(sum + "\n");
			bw.write(mul + "\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			br.close();
			bw.flush();
			bw.close();
			
		}

		System.out.println(" Save Success ! ");
	}

	public static void main(String[] args) {
		String path = "./src/bitcamp1007/io/testreaderwriter.txt";
		try {
			new FileCalculatorUsingReaderWriter().addCalculateResult(path);
		} catch (Exception e) {
			System.out.println("������ ���ų� ��� ������ Ȯ�����ּ���.");
			e.printStackTrace();
		}

	}

}
