 
import java.util.Vector;

public class CusotmerInfoSearch {

	public static void main(String[] args) throws Exception {
		String pathName = "data.txt";
		
		FileUtil.fileToPrint(pathName);
		
		
		
		//data.txt ������ ���� ������ �˻�, ����� ���� vector Instance �ޱ�
		System.out.println("=========================");
		System.out.println("���� ������ ���� ���� �˻�");
		Vector<User> vector = FileUtil.fileFindAddress(pathName, "����");
		for(User user:vector) {
			System.out.println(user);
		}
		
		System.out.println("=========================");
		System.out.println("���� ������ ���� ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "����");
		for(User user:vector) {
			System.out.println(user);
		}
		
		System.out.println("=========================");
		System.out.println("���� ������ ��⵵ ���� �˻�");
		vector = FileUtil.fileFindAddress(pathName, "��⵵");
		for(User user:vector) {
			System.out.println(user);
		}
	}

}
