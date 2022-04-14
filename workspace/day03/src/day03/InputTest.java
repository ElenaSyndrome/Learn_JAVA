package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next(); //입력받는부분
		System.out.print("주소: ");
		sc.nextLine(); //10번줄에서 마지막에 입력한 Enter(\n)를 받아주는 역할 
//		sc = new Scanner(System.in); //sc 초기화
		String addr = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.println(name+"님 환영합니다.");
		System.out.println("사는곳: "+addr);
		System.out.println("5년 뒤에는 "+(age+5)+"살"); //"10"+5 > "105"
	}
}	
