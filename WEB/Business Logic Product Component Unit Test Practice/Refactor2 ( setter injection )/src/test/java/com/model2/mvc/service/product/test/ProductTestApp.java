package com.model2.mvc.service.product.test;

import org.apache.ibatis.session.SqlSession;

import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.Search;
import com.model2.mvc.service.product.dao.ProductDao;

public class ProductTestApp {

	/// main method
	public static void main(String[] args) throws Exception {

		// ==> SqlSessionFactoryBean.getSqlSession()�� �̿� SqlSession instance GET
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();

		// ==> ProductDao ���� �� sqlSession instance setter injection
		ProductDao productDao = new ProductDao();
		productDao.setSqlSession(sqlSession);
		System.out.println("\n");

		// ==> Test �� Product instance ����
		Product product = new Product("2�� �׽�Ʈ ��", "2�� �׽�Ʈ �� ������", "20201114", 22222, "2���׽�Ʈ�ۻ���", "0");
		System.out.println(product);

		//System.out.println(":: 1. addProduct(INSERT)  ? ");
		//System.out.println(":: " + productDao.addProduct(product));

		System.out.println(":: 2. findProduct(SELECT)  ? ");
		product.setProdNo(10032);
		System.out.println(":: " + productDao.getProduct(product.getProdNo()) + "\n");

		product.setProdName("2���׽�Ʈ�� �����׽�Ʈ");
		System.out.println(":: 3. updateProduct(UPDATE)  ? ");
		System.out.println(":: " + productDao.updateProduct(product) + "\n");

		System.out.println(":: 4. ���� ���  ? ");
		System.out.println(":: " + productDao.getProduct(product.getProdNo()) + "\n");

		Search search = new Search();
		search.setStartRowNum(1);
		search.setEndRowNum(3);
		System.out.println(":: 5. getProductList(���ı��� X)  ? ");
		SqlSessionFactoryBean.printList(productDao.getProductList(search));

		System.out.println(":: 6. getProductList(���ı��� �Ǹ��� ��ǰ�� ����)  ? ");
		search.setOrderCondition("0");
		SqlSessionFactoryBean.printList(productDao.getProductList(search));
		
		System.out.println(":: 7. getProductList(���ı��� ����� ��ǰ�� ����)  ? ");
		search.setOrderCondition("1");
		SqlSessionFactoryBean.printList(productDao.getProductList(search));
		
		System.out.println(":: 8. getProductList(���ı��� ���� ������)  ? ");
		search.setOrderCondition("2");
		SqlSessionFactoryBean.printList(productDao.getProductList(search));
		
		System.out.println(":: 9. getProductList(���ı��� ���� ������)  ? ");
		search.setOrderCondition("3");
		SqlSessionFactoryBean.printList(productDao.getProductList(search));
		
		// END::SqlSession close
		System.out.println("::END::SqlSession �ݱ�..");
		sqlSession.close();

	}// end of main
}// end of class