

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Student extends Person {
	private int id;

	public Student(String newName, int newAge, int newId) {
		super.setName(newName);
		super.setAge(newAge);
		this.id = newId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void print() {
		System.out.println(String.format("��    �� : %-10s��  �� : %-6d��    �� : %d", super.getName(), super.getAge(), id));
	}

}

class Teacher extends Person {
	private String subject;

	public Teacher(String newName, int newAge, String newSubject) {
		super.setName(newName);
		super.setAge(newAge);
		this.subject = newSubject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void print() {
		System.out.println(
				String.format("��    �� : %-10s��  �� : %-6d��    �� : %s", super.getName(), super.getAge(), subject));
	}

}

class Employee extends Person {
	private String dept;

	public Employee(String newName, int newAge, String newDept) {
		super.setName(newName);
		super.setAge(newAge);
		this.dept = newDept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void print() {
		System.out
				.println(String.format("��    �� : %-10s��  �� : %-6d��    �� : %s", super.getName(), super.getAge(), dept));
	}

}

public class SchoolRelatedPerson {

	public static void main(String[] args) {

		Student s = new Student("ȫ�浿", 20, 200201);
		Teacher t = new Teacher("�̼���", 30, "JAVA");
		Employee e = new Employee("������", 40, "������");

		s.print();
		t.print();
		e.print();

	}

}
