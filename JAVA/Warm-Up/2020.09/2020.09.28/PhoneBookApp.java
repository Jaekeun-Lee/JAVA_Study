import java.util.*;

public class PhoneBookApp {
	// �޴� ��ȣ�� ���� ����� �����Ѵ�.
	final int INSERT = 0;
	final int DELETE = 1;
	final int SEARCH = 2;
	final int SHOWALL = 3;
	final int EXIT = 4;		
	
	private Scanner scanner;
	private HashMap<String, Phone> map = new HashMap<String, Phone>();
		
	public PhoneBookApp() {
		scanner = new Scanner(System.in);		
	}
	
	 // ��ȭ��ȣ ���� �޼ҵ�
	public void run() {
		System.out.println("-------------------------------------------------");
		System.out.println("��ȭ��ȣ ���� ���α׷��� �����մϴ�. ���Ϸ� �������� �ʽ��ϴ�.");
		System.out.println("-------------------------------------------------");
		while(true) {
			System.out.print("����:0. ����:1, ã��:2, ��ü����:3, ����:4>>");
			int menu = readNumber();
			switch(menu) {
				case INSERT: insert(); break;
				case DELETE: delete(); break;
				case SEARCH: search(); break;
				case SHOWALL: showAll(); break;	
				case EXIT: 	System.out.println("���α׷��� �����մϴ�..."); return;					
				default: System.out.println("�Է��� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���."); continue;
			}
		}	
	}
	
	// ���� �޴��� �����ϸ� �ϳ��� ��ȭ ��ȣ ���ڵ带 �����Ѵ�.
	private void insert() {
		System.out.print("�̸�>>");
		String name = scanner.next();
		if(map.get(name)!=null) {
			System.out.println("�̹� �����ϴ� ����Դϴ�.");
			return;
		}
		
		System.out.print("�ּ�>>");
		String address = scanner.next();
		System.out.print("��ȭ��ȣ>>");
		String telNum = scanner.next();		
		
		// �ؽ� ���̺� ����
		map.put(name, new Phone(name, address, telNum));
	}
	
	// ���� �޴��� �����ϸ� �ϳ��� ��ȭ ��ȣ ���ڵ带 �����Ѵ�.
	private void delete() {
		System.out.print("�̸�>>");
		String name = scanner.next();
		Phone p = map.remove(name); // �ؽ� ���̺��� ����
		if(p == null)
			System.out.println(name +"�� ��ϵ��� ���� ����Դϴ�.");
		else {
			System.out.println(name+"�� �����Ǿ����ϴ�.");
		}
	}
	
	// ã�� �޴��� �����ϸ� �ϳ��� ��ȭ ��ȣ ���ڵ带 �˻��Ѵ�.
	private void search() {
		System.out.print("�̸�>>");
		String name = scanner.next();
		Phone p = map.get(name); // �ؽ����̺��� �˻�
		if(p == null)
			System.out.println(name +"�� ��ϵ��� ���� ����Դϴ�.");
		else
			System.out.println(p.toString());
	}
	
	// ��ü���� �޴��� �����Ѵ�.
	private void showAll() {
		Set<String> keys = map.keySet(); // key ���ڿ��� ���� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator(); // key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		while(it.hasNext()) {
			String name = it.next();
			Phone p = map.get(name);
			System.out.println(p.toString());
		}
	}
	
	private int readNumber() {
		int n=-1;
		try {
			n = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			return -1;
		}
		return n;
	}

	public static void main(String args[]) {
		PhoneBookApp pb = new PhoneBookApp();
		pb.run();
	}
}

// �ϳ��� ��ȭ ��ȣ ������ ������ Ŭ����
class Phone {
	private String name; // �̸�
	private String address; // �ּ�
	private String telNum; // ��ȭ ��ȣ
	
	public Phone(String name, String address, String telNum) {
		this.name = name;
		this.address = address;
		this.telNum = telNum;
	}
	
	public String getName() {return name;}
	public String getAddress() {return address;}
	public String getTelNum() {return telNum;}	
	
	public String toString() {
		return name + " " + address + " " + telNum;
	}
}