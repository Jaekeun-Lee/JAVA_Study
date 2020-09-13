import java.util.Scanner;

public class RectangleTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle r1 = new Rectangle();
		System.out.print("1�� ���簢���� �� : ");
		r1.setColor(sc.next());
		System.out.print("1�� ���簢���� ���� : ");
		r1.setWidth(sc.nextInt());
		System.out.print("1�� ���簢���� ���� : ");
		r1.setLength(sc.nextInt());
		
		Rectangle r2 = new Rectangle();
		System.out.print("2�� ���簢���� �� : ");
		r2.setColor(sc.next());
		System.out.print("2�� ���簢���� ���� : ");
		r2.setWidth(sc.nextInt());
		System.out.print("2�� ���簢���� ���� : ");
		r2.setLength(sc.nextInt());
		
		sc.close();
		System.out.println("\n==============\n");
		System.out.println(r1.getColor()+" ���簢��\n���� = "+r1.area()+"\n�ѷ� = "+r1.perimiter());
		System.out.println("\n==============\n");
		System.out.println(r2.getColor()+" ���簢��\n���� = "+r2.area()+"\n�ѷ� = "+r2.perimiter());
		System.out.println("\n==============\n");
		
		System.out.print("���� �� ==>");
		if(r1.area()>r2.area()) {
			System.out.println(r1.getColor()+" ���簢���� ���̰� �� �н��ϴ�.");
		}else if(r1.area()<r2.area()){
			System.out.println(r2.getColor()+" ���簢���� ���̰� �� �н��ϴ�.");
		}else {
			System.out.println("�� ���簢���� ���̴� �����ϴ�.");
		}
		
		System.out.print("�ѷ� �� ==>");
		if(r1.perimiter()>r2.perimiter()) {
			System.out.println(r1.getColor()+" ���簢���� �ѷ��� �� Ů�ϴ�.");
		}else if(r1.perimiter()<r2.perimiter()){
			System.out.println(r2.getColor()+" ���簢���� �ѷ��� �� Ů�ϴ�.");
		}else {
			System.out.println("�� ���簢���� �ѷ��� �����ϴ�.");
		}
	}
}
