package day05;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~10까지 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
//	==========================================	
		// 10~1까지 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}
//		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}

		// i 출력할 값
		// i+출력값 = 10
		// 출력값 = 10 - i
		// 0 10 = 10
		// 1 9 = 10
		// 2 8 = 10
		// 3 7
//	============================================

		// 정수 하나 입력받아서, 1~그 수까지 출력
		// 입력
		int num = 0;
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		// 처리, 출력
		// 1~ 위에서 입력받은 정수까지 출력

		/*
		 * for(int i =1;i<=num;i++) { System.out.println(i); }
		 */
		for (int i = 0; i < num; i++) {
			System.out.println(i + 1);
		}

// ========================================================		
		// 1~10까지 합 출력
		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//		}
		for (int i = 0; i < 10; i++) {
			sum += i + 1; // 복합대입연산자는 가장 마지막 우선순위라 산술이 먼저 수행됨, 따라서 괄호 X
		}
		System.out.println("총합 : " + sum);
// ========================================================		
		// 1~100까지 짝수만 출력
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

		// 정수 두개 입력받아서, n~m 까지의 합 출력(n<m)
		//입력
		//정수 두개 입력받기
		int n=0, m=0;
		n=sc.nextInt();
		m=sc.nextInt();
		
		//처리
		//위에서 입력받은 (n,m)
		// n부터 m까지 반복하며 누적
		int sum2=0;
		for (int i = n; i < m; i++) {
			sum2+=i;
		}
		
//		for (int i = 0; i <= m-n; i++) {
//			sum2+=(i+n);
//		}
		//출력
		//위에서 누적된 결과 출력
		System.out.println(sum2);
//	=========================================================
		// A~F 출력
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
		// AbCdE....z 출력
		//01234...25
		//AbCdE...z 
		
		//A : 65(65+0)	a : 97(97+0)
		//C : 67(65+2)	b : 98(97+1)
		//E : 69(65+4)	d : 100(97+3)
		for (int i = 0; i < 26; i++) {
			if(i%2==0) {//i가 짝수일때 대문자
				System.out.print((char)(65+i));
			}
			else {//i가 홀수일때 소문자
				System.out.print((char)(97+i));
			}
		}
//	=========================================================
		// for문 한개 이용해서 구구단 전체 출력하기
		//0~8 : 1 	9:enter
		//9~17 : 2  19:enter
//		for (int i = 0; i <= 81; i++) {
//			System.out.printf("%d X %d = %d\n", i/9+1, i%9+1,(i/9+1)*(i%9+1));
//		}
		for (int i = 0; i < 90; i++) {
			if(i%10==9) {
				System.out.println((i/10+1)+"단");
			}
			else {
			System.out.printf("%d X %d = %d\n", i/10+1, i%10+1,(i/10+1)*(i%10+1));
			}
		}
//	=========================================================
		// 10진법 숫자 하나 입력받아서 2진법으로 변환하여 출력하기
		int num1 = 10;
		String result="";
		for (int i = num1; i > 0; i/=2) {//i가0보다 클동안 2로 나누기
			System.out.print(i%2);
			result += i%2;
		} 
		
		//new StringBuffer("문자열").reverse() : 문자열 뒤집기
		System.out.println(new StringBuffer(result).reverse());
		
//		for (int i = result.length()-1; i>=0; i--) {
//			System.out.println(result.charAt(i));
//		}
	}
}
