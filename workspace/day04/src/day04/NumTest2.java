package day04;

import java.util.Scanner;

public class NumTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		//Ctrl+Shift+F : �ڵ����� ����Ű
		if(num>10) {
			System.out.println("�� ���� 10���� Ů�ϴ�.");
		}
		else if(num==10) {
			System.out.println("�� ���� 10�Դϴ�.");
		}
		else {
			System.out.println("�� ���� 10���� �۽��ϴ�.");
		}
	}
}
