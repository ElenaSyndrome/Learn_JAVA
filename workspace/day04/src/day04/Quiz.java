package day04;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
		System.out.println("1. C���\n2. JAVA\n3. ���վ�\n4. ���̽�");
		choice = sc.nextInt();
		switch(choice) {
		case 3:
			System.out.println("�����Դϴ�.");
			break;
		case 1:case 2:case 4:
			System.out.println("�����Դϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
}
