package com.gl.balancingbracket;

import java.util.Scanner;

import java.util.Stack;

public class BalancingBrackets {

	public static void main(String[] args) {
		try (var sc = new Scanner(System.in)) {
			System.out.println("Enter Input Expression");
			String bracketExpression = sc.next();
			boolean result;

			result = isBracketBalanced(bracketExpression);
			if (result)
				System.out.println("The entered String has Balanced Brackets");
			else
				System.out.println("The entered String does not contain Balanced Brackets ");
		}
	}

	private static boolean isBracketBalanced(String bracketExpression) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			Character ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty())
					return false;
				stack.pop();
			}

		}
		return stack.isEmpty() ? true : false;

	}

}
