package iopractice;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;



//���Ͽ� ���ڸ� ���ڸ� ���� �� ���� �۵��ϴ� App


public class FileCalculatorUsingInputOutputStream {

	public void addCalculateResult(String inputFileName) throws Exception {

		InputStream is = new FileInputStream(inputFileName);
		DataOutputStream os = new DataOutputStream(new FileOutputStream(inputFileName, true));

		byte[] c = new byte[3]; 

		int a = is.read(c); //����Ʈ �迭���� �б�
		int sum = 0;
		int mul = 1;
		int index = 0;
		while (a != -1) { 			//������ loop
			sum+=(int)c[index]-48;	//����Ʈ�� ���� �ƽ�Ű�ڵ� char������ ����ȯ �� ����
			mul*=(int)c[index]-48;	//����Ʈ�� ���� �ƽ�Ű�ڵ� char������ ����ȯ �� ����
			a = is.read(c);
		}

		//������ : ���Ͽ� ���ڸ� ���ڸ� ���� ���� ���� �۵��ϴ� App 
		
		os.writeBytes("\n");
		os.writeBytes(String.valueOf(sum));
		os.writeBytes("\n");
		os.writeBytes(String.valueOf(mul));
		
		is.close();
		os.close();
		
		System.out.println(" Save Success ! ");
	}

	public static void main(String[] args) {
		String path = "./src/bitcamp1007/io/testinputoutputstream.txt";
		try {
			new FileCalculatorUsingInputOutputStream().addCalculateResult(path);
		} catch (Exception e) {
			System.out.println("������ ���ų� ��� ������ Ȯ�����ּ���.");
			e.printStackTrace();
		}
	}

}
