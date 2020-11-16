package ibatis.services.user.test;

import java.io.Reader;
import java.util.List;

import mybatis.service.domain.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * FileName : MyBatisTestApp.java
  * �� JBDCTestApp.java �� �� ����.
  * �� MyBatis Framework ���� �����ϴ� API�� ��� users table �� ���� SELECT   
 */
public class MyBatisTestApp01 {

	/// main method
	public static void main(String[] args) throws Exception {

		Reader reader = Resources.getResourceAsReader("sql/mybatis-config01.xml");

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession sqlSession = sqlSessionFactory.openSession();

		List<User> list = sqlSession.selectList("UserMapper01.getUserList");

		
		System.out.println("#####################################");
		System.out.println(":: ������� ���");

		for (User user : list) {
			System.out.println(user.toString());
		}
		System.out.println("#####################################");
		
		User user = (User)sqlSession.selectOne("UserMapper01.getUser","user01");
		System.out.println(":: 1. get(SELECT) ? " + user.toString());
		
		user.setUserId("user03");
		user.setPassword("user03");
		String name = (String)sqlSession.selectOne("UserMapper01.findUserId",user);
		System.out.println(":: 2. get(SELECT) ? " + name );
		
		List<String> list02 = sqlSession.selectList("UserMapper01.getUserListAge",20);
		for (String s : list02) {
			System.out.println(s);
		}
		sqlSession.close();
	}// end of main
}// end of class

