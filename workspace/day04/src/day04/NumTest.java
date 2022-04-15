package day04;

import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		//10 입력 시 "이 수는 10입니다" 나오게하기
		String result = num>10?"이 수는 10보다 큽니다.":num==10?"이 수는 10입니다":"이 수는 10보다 작습니다.";

		//		System.out.println(num>10?"이 수는 10보다 큽니다.":"이 수는 10보다 작습니다.");
		System.out.println(result);
		
	}
}	
