package day04;

import java.util.Scanner;

public class StrEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg="";
		System.out.print("ä��: ");
		msg = sc.next();
		
		//���ڿ� �񱳴� == �����ڷ� ���� �ʴ´�.
		//"���ڿ�1".equals("���ڿ�2") : ���ڿ�1�� ���ڿ�2�� 
		//							������ ���ڿ� ���̶�� true
//		if(msg.equals("�ٺ�")) {
//			System.out.println("�ٺ���� ������!");
//		}
//		else if(msg.equals("�˰�")) {
//			System.out.println("�˰���� ������!");
//		}
//		else {
//			System.out.println("����� �ϴ��� �𸣰ھ��.");
//		}
		
		switch(msg) {
		case "�ٺ�":
			System.out.println("�ٺ���� ������!");
			break;
		case "�˰�":
			System.out.println("�˰���� ������!");
			break;
		default:
			System.out.println("����� �ϴ��� �𸣰ھ��.");
		}
	}
}
