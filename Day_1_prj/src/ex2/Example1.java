package ex2;

import java.io.IOException;


public class Example1 {
	
	public static int add(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
	
	public static void main(String args[]) throws IOException {
		
		int result = add(20, 30);
		
		System.out.println("result : "+ result);
		
	}
}
