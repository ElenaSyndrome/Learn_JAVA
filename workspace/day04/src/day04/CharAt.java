package day04;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		//Hello
		//3
		//3��° ��¥�� l �Դϴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ�: ");
		String msg = sc.next();
		System.out.print("�̾ƿ� ������ ��ġ: ");
		int idx = sc.nextInt();
		//"���ڿ�".length() : ���ڿ��� ����
		if(idx>msg.length() || idx<=0) {//idx�� msg�� ���̺��� ũ�ٸ� �Ǵ� 0���� �۰ų� ���ٸ�
			System.out.println("���ڿ� ���� �ٱ��Դϴ�.");
		}
		else {
			//"���ڿ�".charAt(��ġ������) : �ش��ϴ� ��ġ�� �� ���� �̾ƿ���(idx�� 0���� ����)
			char ch = msg.charAt(idx-1); // ��°�ΰ� char���̹Ƿ� char ������ ����������
			System.out.println(idx+"��° ���ڴ� "+ch+" �Դϴ�.");
		}
	}
}	
