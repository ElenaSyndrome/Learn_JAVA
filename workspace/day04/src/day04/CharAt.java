package day04;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		//Hello
		//3
		//3번째 글짜는 l 입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String msg = sc.next();
		System.out.print("뽑아올 문자의 위치: ");
		int idx = sc.nextInt();
		//"문자열".length() : 문자열의 길이
		if(idx>msg.length() || idx<=0) {//idx가 msg의 길이보다 크다면 또는 0보다 작거나 같다면
			System.out.println("문자열 범위 바깥입니다.");
		}
		else {
			//"문자열".charAt(위치정수값) : 해당하는 위치의 한 문자 뽑아오기(idx는 0부터 시작)
			char ch = msg.charAt(idx-1); // 통째로가 char값이므로 char 변수에 넣을수있음
			System.out.println(idx+"번째 글자는 "+ch+" 입니다.");
		}
	}
}	
