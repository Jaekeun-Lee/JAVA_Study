package bitcamp015;

import java.util.Vector;

public class ArrayCopy {

	public static Vector<String> moveToVector(String [] datas){
		Vector<String> vc = new Vector<String>(datas.length-1);
		
		//�������� �����ϱ�
		for(int i = datas.length-1;i>=0; i--) {
			vc.add(datas[i]);
		}
		
		//������� �����ϰ� ������
		
		return vc;
	}
	public static void main(String[] args) {
		String [] datas = {"1","2","3","4","5"};
		System.out.println(moveToVector(datas));
	}

}
