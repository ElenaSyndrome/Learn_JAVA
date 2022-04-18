package day07;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		sc.next();
		MethodTest m = new MethodTest();
		System.out.println(m.f(10));
		
		m.add(10, 5);
		
	}
	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	int f(int x){
		return 2*x+1;
	}
}
