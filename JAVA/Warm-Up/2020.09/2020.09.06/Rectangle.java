public class Rectangle {

	/// Field
	int width; // ����
	int length; // ����
	String color; // ��

	
	
	/// Method
	// getter,setter method
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// ���� ���
	public int area() {

		int area = width*length;
		
		return area;
	}

	

	// �ѷ� ���
	public int perimiter() {

		int perimiter = 2*(width+length);

		return perimiter;
	}

}
