package spring.service.lifecycle;

public class LifeCycle02 {

	
	private static LifeCycle02 lifeCycle;
	
	private LifeCycle02() {
		System.out.println(getClass().getName()+"�� ����Ʈ ������");
	}

	public static LifeCycle02 getInstance() {
		if( lifeCycle == null) { 
			lifeCycle = new LifeCycle02();
		}
		return lifeCycle;
	}
}