package day04;

import java.util.Scanner;

public class Mod {
	public static void main(String[] args) {
		//a%b : a�� b�� ���� ������
		//¦���� ����غ���.
		int num1=0, num2=0, num3=0, num4=0, num5=0; 
		Scanner sc = new Scanner(System.in);
		//�Է� ��
		//10 1 5 7 8
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		
		//�� ���ڵ� �� Ȧ������ �� ���
		int total = 0;
		if(num1%2!=0) {
			total=total+num1;
		}
		if(num2%2!=0) {
			total=total+num2;
		}
		if(num3%2!=0) {
			total=total+num3;
		}
		if(num4%2!=0) {
			total=total+num4;
		}
		if(num5%2!=0) {
			total=total+num5;
		}
		
		System.out.println("Ȧ�� ���� : "+total);
		
//		�� ���ڰ� ¦���� �� ����ϴ� �ڵ�
//		if(num1%2==0) {
//			System.out.println(num1);
//		}
//		if(num2%2==0) {
//			System.out.println(num2);
//		}
//		if(num3%2==0) {
//			System.out.println(num3);
//		}
//		if(num4%2==0) {
//			System.out.println(num4);
//		}
//		if(num5%2==0) {
//			System.out.println(num5);
//		}
	}
}	
