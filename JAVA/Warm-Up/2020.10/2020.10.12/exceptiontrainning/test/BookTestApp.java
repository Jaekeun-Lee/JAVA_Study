package iopractice.exceptiontrainning.test;

import java.util.Vector;

import iopractice.exceptiontrainning.Book;
import iopractice.exceptiontrainning.exceptionf.DataFormatException;

public class BookTestApp {

	private static Book makeBook(String bookData) throws DataFormatException {

		// title,kind,rentalPrice ������ 3���� ���ڰ� ���;���.
		String[] param = bookData.split(":");

		if (param.length == 3) {

			String title = param[0];
			String kind = param[1];
			int rentalPrice = Integer.parseInt(param[2]);

			return new Book(title, kind, rentalPrice);

		} else {
			throw new DataFormatException(param[0] + " å�� ��ȯ�� �� ���� ������ �����Դϴ�.");
		}

	}

	private static void printBookList(Vector<Book> bookList) {

		for (Book b : bookList) {
			System.out.println(b.toString());
		}

	}

	public static void main(String[] args) {

		Vector<Book> bookList = new Vector<Book>();

		try {

			bookList.add(makeBook("Java Programming ����:��ǻ��:35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL:��ǻ��:28000"));
			bookList.add(makeBook("HTML5API �Ұ�:��ǻ��:58000"));
			// case1
			bookList.add(makeBook("JDBC Programming ����:��ǻ��:45000"));
			// case2
			//bookList.add(makeBook("JDBC Programming ����2:��ǻ��"));
			bookList.add(makeBook("JSP Programming ���:��ǻ��:58000"));

			System.out.println("<< å ��� >>");
			BookTestApp.printBookList(bookList);

		} catch (DataFormatException e) {
			System.out.println(e.getMessage());
			
		} catch (NumberFormatException e1) {
			System.out.println("[usage]:: å�̸�:�帣:�뿩��� ");
			e1.printStackTrace();
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
