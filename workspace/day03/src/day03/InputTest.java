package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = sc.next(); //�Է¹޴ºκ�
		System.out.print("�ּ�: ");
		sc.nextLine(); //10���ٿ��� �������� �Է��� Enter(\n)�� �޾��ִ� ���� 
//		sc = new Scanner(System.in); //sc �ʱ�ȭ
		String addr = sc.nextLine();
		System.out.print("����: ");
		int age = sc.nextInt();
		System.out.println(name+"�� ȯ���մϴ�.");
		System.out.println("��°�: "+addr);
		System.out.println("5�� �ڿ��� "+(age+5)+"��"); //"10"+5 > "105"
	}
}	
