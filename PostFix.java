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
		//  �ԵȺ���Ϊ����ѭ�����ж������������һ��
		while(token.charAt(0) != '=') {
			try {
				isNumber = true;
				result = Double.parseDouble(token);		//  ��δ�ܳɹ���StringתΪDouble�����׳� NumberFormatException��˵�����в��ܱ�ת�����ַ�����'+'��'-'��'*'��
			} catch(Exception e) {
				isNumber = false;						//  ���׳��쳣��isNumber��Ϊfalse�������ж��Ƿ�Ϊ������ţ���������Ӧ����
			}
			
			if(isNumber) {
				s.push(result);				//  ����������ջ
			} 
			else {
				switch(token.charAt(0)) {
					case '+': {				//  ��a,b��ջ��Ȼ������a-bѹջ
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
