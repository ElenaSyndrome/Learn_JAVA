package day05;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~10���� ���
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
//	==========================================	
		// 10~1���� ���
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}
//		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}

		// i ����� ��
		// i+��°� = 10
		// ��°� = 10 - i
		// 0 10 = 10
		// 1 9 = 10
		// 2 8 = 10
		// 3 7
//	============================================

		// ���� �ϳ� �Է¹޾Ƽ�, 1~�� ������ ���
		// �Է�
		int num = 0;
		System.out.print("���� �Է�: ");
		num = sc.nextInt();
		// ó��, ���
		// 1~ ������ �Է¹��� �������� ���

		/*
		 * for(int i =1;i<=num;i++) { System.out.println(i); }
		 */
		for (int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}

// ========================================================		
		// 1~10���� �� ���
		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
		for (int i = 0; i < 10; i++) {
			sum += i + 1; // ���մ��Կ����ڴ� ���� ������ �켱������ ����� ���� �����, ���� ��ȣ X
		}
		System.out.println("���� : " + sum);
// ========================================================		
		// 1~100���� ¦���� ���
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		for (int i = 0; i < 100; i++) {
			if ((i+1) % 2 == 0) {
				System.out.println(i);
			}
		}

		// ���� �ΰ� �Է¹޾Ƽ�, n~m ������ �� ���(n<m)
		//�Է�
		//���� �ΰ� �Է¹ޱ�
		int n=0, m=0;
		n=sc.nextInt();
		m=sc.nextInt();
		
		//ó��
		//������ �Է¹��� (n,m)
		// n���� m���� �ݺ��ϸ� ����
		int sum2=0;
		for (int i = n; i < m; i++) {
			sum2+=i;
		}
		
//		for (int i = 0; i <= m-n; i++) {
//			sum2+=(i+n);
//		}
		//���
		//������ ������ ��� ���
		System.out.println(sum2);
//	=========================================================
		// A~F ���
		//A : 65
		//B : 66
		//F : 70
		//65~70
		for (int i = 65; i < 70; i++) {
			System.out.println((char)i);
		}
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(65+i));
//		}
//	=========================================================
		// AbCdE....z ���
		//01234...25
		//AbCdE...z 
		
		//A : 65(65+0)	a : 97(97+0)
		//C : 67(65+2)	b : 98(97+1)
		//E : 69(65+4)	d : 100(97+3)
		for (int i = 0; i < 26; i++) {
			if(i%2==0) {//i�� ¦���϶� �빮��
				System.out.print((char)(65+i));
			}
			else {//i�� Ȧ���϶� �ҹ���
				System.out.print((char)(97+i));
			}
		}
//	=========================================================
		// for�� �Ѱ� �̿��ؼ� ������ ��ü ����ϱ�
		//0~8 : 1 	9:enter
		//9~17 : 2  19:enter
//		for (int i = 0; i <= 81; i++) {
//			System.out.printf("%d X %d = %d\n", i/9+1, i%9+1,(i/9+1)*(i%9+1));
//		}
		for (int i = 0; i < 90; i++) {
			if(i%10==9) {
				System.out.println((i/10+1)+"��");
			}
			else {
			System.out.printf("%d X %d = %d\n", i/10+1, i%10+1,(i/10+1)*(i%10+1));
			}
		}
//	=========================================================
		// 10���� ���� �ϳ� �Է¹޾Ƽ� 2�������� ��ȯ�Ͽ� ����ϱ�
		int num1 = 10;
		String result="";
		for (int i = num1; i > 0; i/=2) {//i��0���� Ŭ���� 2�� ������
			System.out.print(i%2);
			result += i%2;
		} 
		
		//new StringBuffer("���ڿ�").reverse() : ���ڿ� ������
		System.out.println(new StringBuffer(result).reverse());
		
//		for (int i = result.length()-1; i>=0; i--) {
//			System.out.println(result.charAt(i));
//		}
	}
}
