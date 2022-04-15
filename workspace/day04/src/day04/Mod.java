package day04;

import java.util.Scanner;

public class Mod {
	public static void main(String[] args) {
		//a%b : a를 b로 나눈 나머지
		//짝수만 출력해보자.
		int num1=0, num2=0, num3=0, num4=0, num5=0; 
		Scanner sc = new Scanner(System.in);
		//입력 예
		//10 1 5 7 8
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		num5=sc.nextInt();
		
		//각 숫자들 중 홀수들의 합 출력
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
		
		System.out.println("홀수 총합 : "+total);
		
//		각 숫자가 짝수일 때 출력하는 코드
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
