package day03;

import java.util.Scanner;

//Alt+Shift+R : 관련된 모든 단어 바꾸는 단축키
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수: ");
		int num1 = sc.nextInt(); 
		System.out.print("두번째 정수: ");
		int num2 = sc.nextInt(); 
		
		System.out.print("나눗셈 결과: "+(num1+0.0)/num2);
	}
}
