package iopractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Grade {

	public void printGrade(String fileName) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(fileName));
		// HashMap�� ���� ������ �������� ����, LinkedHashMap�� �̿��Ͽ� �Է� ������� ����
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		StringBuilder printStr = new StringBuilder();

		int sum = 0;
		String s = null;

		// LinkedHashMap���� ���1. StringTokenizer ���

		while ((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s, ",");
			// ���� ���ڿ� �и��ؼ� Ű=�̸� / ��=������ ����ȯ ����
			map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
		}
		
		
	/*
		// LinkedHashMap���� ���2. String �迭�� �и��� ���ڿ� �޾Ƽ� ���
		
		int index = 0;
		String[] splitStr = new String[2];

		while ((s = br.readLine()) != null) {

			splitStr = s.split(",");
			// ���� ���ڿ� �и��ؼ� Ű=�̸� / ��=������ ����ȯ ����
			map.put(splitStr[index], Integer.parseInt(splitStr[index + 1]));
			index = 0;

		}
	*/
		
		// map ��ü ���� ���
		// System.out.println(map.toString());

		// �������� ���
		for (Entry<String, Integer> entry : map.entrySet()) {
			printStr.append(entry.getKey());
			printStr.append("�� ������ ");
			printStr.append(entry.getValue());
			printStr.append("�� �Դϴ�. \n");
			sum+=entry.getValue();
		}
		
		//������ , ������� ���
		printStr.append("����� ������ ");
		printStr.append(sum); 
		printStr.append("�� �Դϴ�.\n����� ����� "); 
		printStr.append(sum/map.size());
		printStr.append("�� �Դϴ�."); 
		
		System.out.println(printStr.toString());
		br.close();
	}

	public static void main(String[] args) {

		String path = "score.txt";

		try {

			new Grade().printGrade(path);

		} catch (FileNotFoundException e) {
			// printGrade()���� ���� FileNotFoundException ���� ó�� ����
			try {

				// ������ �������� ������ path�� ���� ��ο� ���� ����
				new File(path).createNewFile();
				BufferedWriter creater = null;

				try {
					creater = new BufferedWriter(new FileWriter(path));

					creater.write("ȫ�浿,50\n");
					creater.write("�Ѹ�,60\n");
					creater.write("�����,90\n");
					creater.write("ö��,100\n");
					creater.flush();

				} catch (IOException e1) {
					e1.printStackTrace();

				} finally {
					creater.close();
				}

				System.out.println("���� ���� �� ���� �Ǿ����ϴ�! �ٽ� �������ּ���!! \n");

			} catch (IOException e2) {
				System.out.println("���� ���� �� ������ �߻��߽��ϴ�!");
				e2.printStackTrace();
			}

		} catch (Exception e3) {
			// printGrade()���� ���� ��Ÿ ���� ó��
			e3.printStackTrace();

		}

		
	}// end of main

	
}// end of file
