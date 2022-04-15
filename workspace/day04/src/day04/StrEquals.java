package day04;

import java.util.Scanner;

public class StrEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg="";
		System.out.print("채팅: ");
		msg = sc.next();
		
		//문자열 비교는 == 연산자로 하지 않는다.
		//"문자열1".equals("문자열2") : 문자열1과 문자열2가 
		//							동일한 문자열 값이라면 true
//		if(msg.equals("바보")) {
//			System.out.println("바보라고 하지마!");
//		}
//		else if(msg.equals("똥개")) {
//			System.out.println("똥개라고 하지마!");
//		}
//		else {
//			System.out.println("뭐라고 하는지 모르겠어요.");
//		}
		
		switch(msg) {
		case "바보":
			System.out.println("바보라고 하지마!");
			break;
		case "똥개":
			System.out.println("똥개라고 하지마!");
			break;
		default:
			System.out.println("뭐라고 하는지 모르겠어요.");
		}
	}
}
