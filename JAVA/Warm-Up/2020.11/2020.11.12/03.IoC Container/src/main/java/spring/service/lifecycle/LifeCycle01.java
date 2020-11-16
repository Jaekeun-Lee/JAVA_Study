package spring.service.lifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class LifeCycle01 implements BeanNameAware {

	public LifeCycle01() {
		System.out.println(getClass().getName()+"�� ����Ʈ ������");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println(getClass().getName()+"�� �������̵��� setBean start");
		System.out.println("setBeanName = "+name);
		System.out.println(getClass().getName()+"�� �������̵��� setBean end");
	}
	
	public void init() {
		System.out.println(getClass().getName()+"init()");
	}
	
	public void destory() {
		System.out.println(getClass().getName()+"destory()");
	}

}
