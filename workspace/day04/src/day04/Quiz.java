package day04;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		System.out.println("다음 중 프로그래밍 언어가 아닌 것은?");
		System.out.println("1. C언어\n2. JAVA\n3. 망둥어\n4. 파이썬");
		choice = sc.nextInt();
		switch(choice) {
		case 3:
			System.out.println("정답입니다.");
			break;
		case 1:case 2:case 4:
			System.out.println("오답입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
}
