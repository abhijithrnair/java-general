package com.dsa.hackerrank.stack;

import java.util.*;
class BalancedString{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
			char[] expression = input.toCharArray();
			isBalanced(expression);
		}
//		Character[] expression = ;//{'(',')'};
//		System.out.println();
	}
	
	static boolean isBalanced(char[] expression) {
		int n = expression.length;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<=n-1;i++) {
			if(expression[i]=='(' || expression[i]=='{' || expression[i]=='[') {
				stack.push((Character)expression[i]);
			}
			else if(expression[i]==')' || expression[i]=='}' || expression[i]==']') {
				if(stack.isEmpty()||!isMatchingPair(stack.peek(), expression[i])) {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
//		System.out.println(stack.isEmpty());
	return stack.isEmpty();
	}
	
	static boolean isMatchingPair(char character1, char character2) 
    { 
       if (character1 == '(' && character2 == ')') 
         return true; 
       else if (character1 == '{' && character2 == '}') 
         return true; 
       else if (character1 == '[' && character2 == ']') 
         return true; 
       else
         return false; 
    } 
}



