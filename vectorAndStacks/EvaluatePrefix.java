package stackk;
import java.util.Stack;
public class EvaluatePrefix {
	public static void main(String[] args) {
		String exp = "-+*23*549";
		System.out.println("prefix expression: " + evalPrefix(exp));
	}
	static int evalPrefix(String exp) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i = exp.length()-1; i>= 0; i--) {
			char c = exp.charAt(i);
			
			if(Character.isDigit(c))
				stack.push(c- '0');
			else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c) {
				case '+':
					stack.push(val1 + val2);
					break;
				case '-':
					stack.push(val1 - val2);
					break;
				case '*':
					stack.push(val1 * val2);
					break;
				case '/':
					stack.push(val1 / val2);
					break;	
				}
			}
		}
		return stack.pop();
	}
}
