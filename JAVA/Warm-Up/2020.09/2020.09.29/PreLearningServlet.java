 
public class PreLearningServlet {

	private static String getParameter(String url, String paramName) {

		int start = url.indexOf(paramName) + paramName.length() + 1;
		int end = url.indexOf("&", url.indexOf(paramName) + paramName.length() + 1);
		String resultStr = "";

		try {
			resultStr = url.substring(start, end);
		} catch (StringIndexOutOfBoundsException e) {
			resultStr = url.substring(url.lastIndexOf("&") + paramName.length() + 2, url.length());
		}

		return resultStr;
	}

	public static void main(String[] args) {

		String url1 = "http://localhost/order?prodId=PROD-001&prodName=������11Pro&price=1210000";
		String url2 = "http://localhost/registUser?userId=USER-001&userName=�����&address=��⵵ ��õ��&userAge=25";

		System.out.println("��ǰ ��ȣ : " + getParameter(url1, "prodId"));
		System.out.println("��ǰ �̸� : " + getParameter(url1, "prodName"));
		System.out.println("��ǰ ���� : " + getParameter(url1, "price"));
		System.out.println("=========================");
		System.out.println("ȸ�� ��ȣ : " + getParameter(url2, "userId"));
		System.out.println("ȸ�� �̸� : " + getParameter(url2, "userName"));
		System.out.println("ȸ�� �ּ� : " + getParameter(url2, "address"));
		System.out.println("ȸ�� ���� : " + getParameter(url2, "userAge"));

	}

}
