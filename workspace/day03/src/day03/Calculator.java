package day03;

import java.util.Scanner;

//Alt+Shift+R : ���õ� ��� �ܾ� �ٲٴ� ����Ű
public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int num1 = sc.nextInt(); 
		System.out.print("�ι�° ����: ");
		int num2 = sc.nextInt(); 
		
		System.out.print("������ ���: "+(num1+0.0)/num2);
	}
}
