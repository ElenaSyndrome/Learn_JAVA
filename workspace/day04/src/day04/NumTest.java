package day04;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		//10 �Է� �� "�� ���� 10�Դϴ�" �������ϱ�
		String result = num>10?"�� ���� 10���� Ů�ϴ�.":num==10?"�� ���� 10�Դϴ�":"�� ���� 10���� �۽��ϴ�.";

		//		System.out.println(num>10?"�� ���� 10���� Ů�ϴ�.":"�� ���� 10���� �۽��ϴ�.");
		System.out.println(result);
		
	}
}	
