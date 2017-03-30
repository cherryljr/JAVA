import java.util.Scanner;
import java.util.Stack;


public class PostFix {

	/**
	 * The following function evaluates a postfix expression, using +, -, *, /, and ^ ending in =. It requires
	 * spaces between all operators and =.
	 */
	public static void main(String[] args) {
		System.out.println(PostFix.evalPostFix());
	}
	
	public static double evalPostFix() {
		Stack<Double> s = new Stack<Double>();
		String token;
		Double a, b, result = 0.0;
		boolean isNumber;
		
		Scanner sc = new Scanner(System.in);
		token = sc.next();
		//  以等号作为结束循环的判断条件，即最后一步
		while(token.charAt(0) != '=') {
			try {
				isNumber = true;
				result = Double.parseDouble(token);		//  若未能成功将String转为Double将会抛出 NumberFormatException，说明含有不能被转换的字符。如'+'、'-'、'*'等
			} catch(Exception e) {
				isNumber = false;						//  若抛出异常则将isNumber置为false，进行判断是否为运算符号，并进行相应操作
			}
			
			if(isNumber) {
				s.push(result);				//  是数字则入栈
			} 
			else {
				switch(token.charAt(0)) {
					case '+': {				//  将a,b出栈，然后将数据a-b压栈
						a = s.pop();
						b = s.pop();
						s.push(a + b);
						break;
					}
					case '-': {
						a = s.pop();
						b = s.pop();
						s.push(a - b);
						break;
					}
					case '*': {
						a = s.pop();
						b = s.pop();
						s.push(a * b);
						break;
					}
					case '/': {
						a = s.pop();
						b = s.pop();
						s.push(a / b);
						break;
					}
					case '^': {
						a = s.pop();
						b = s.pop();
						s.push(Math.exp(a * Math.log(b)));
						break;
					}
				}	
			}
			
			token = sc.next();
		}
		
		return s.peek();
	}

}
