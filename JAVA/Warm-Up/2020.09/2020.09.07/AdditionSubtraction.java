
public class AdditionSubtraction {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result;
		
		if(num1>num2) {
			result = num1-num2;
			System.out.println("ù��° �μ� :"+num1+" / �ι�° �μ� :"+num2+"\n"
					+ num1+" - "+num2+" = "+result);
		}else {
			result = num1+num2;
			System.out.println("ù��° �μ� :"+num1+" / �ι�° �μ� :"+num2+"\n"
					+ num1+" + "+num2+" = "+result);
		}
	}

}
