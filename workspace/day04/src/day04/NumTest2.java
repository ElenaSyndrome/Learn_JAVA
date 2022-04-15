package day04;

import java.util.Scanner;

public class NumTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		//Ctrl+Shift+F : 자동정렬 단축키
		if(num>10) {
			System.out.println("이 수는 10보다 큽니다.");
		}
		else if(num==10) {
			System.out.println("이 수는 10입니다.");
		}
		else {
			System.out.println("이 수는 10보다 작습니다.");
		}
	}
}
