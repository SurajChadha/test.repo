package dataStructures;

import java.util.Stack;

public class PostFixEvaluation {
	static boolean isOperator(char ch) {
		if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		return false;
	}

	static void evaluatePostFix(String exp) {
		Stack<Integer> postFix = new Stack<>();
		// postfix stack
		int n = exp.length();

		for (int i = 0; i < n; i++) {
			if (isOperator(exp.charAt(i))) {
				// pop 2 operands
				int op1 = postFix.pop();
				int op2 = postFix.pop();
				// evaluate in reverse order i.e op2 operator op1
				switch (exp.charAt(i)) {
					case '+':
						postFix.push(op2 + op1);
						break;
					case '-':
						postFix.push(op2 - op1);
						break;
					case '*':
						postFix.push(op2 * op1);
						break;
					case '/':
						postFix.push(op2 / op1);
						break;
				}
			}
			// current Char is Oper- and simple push into stack

			else {
				// convert to integer
				int operand = exp.charAt(i) - '0';
				postFix.push(operand);
			}
		}
		// Stack at End will contain result
		System.out.println(postFix.pop());
	}

	public static void main(String args[]) {
		String exp = "823*+7/1-";
		System.out.println("The postfix evaluation for the given expression" + exp + "is:");
		evaluatePostFix(exp);
	}
}
