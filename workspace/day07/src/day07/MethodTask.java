package day07;

import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask m = new MethodTask();
		
		m.print1To10();
		
		System.out.println("1부터 10까지의 합: "+m.sum1To10());
		
		System.out.println("1부터 N까지의 합: "+m.sum1ToN(100));
		
		System.out.println("두 정수의 나눗셈: "+m.div(10, 3));
		
	}
	
	//1~10까지 출력하는 메소드
	void print1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
//	====================================
	
	//1~10까지 합 구해주는 메소드
	int sum1To10() {
		int sum =0;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
		}
		return sum;
	}
//	======================================
	
	//n은 사용하는 부분에서 입력받은 후 값 넘겨받기
	//1~n까지 합 구해주는 메소드
	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i+1;
		}
		return sum;
	}
//	========================================
	//두 정수의 나눗셈 결과 구해주는 메소드
	double div(int num1, int num2) {
		return (double)num1/num2;
	}
//	=========================================
	//문자열의 소문자를 대문자로 바꿔주는 메소드("hEllo" -> "HELLO")
	//문자열 거꾸로 출력하는 메소드("HELLO" -> "OLLEH")
	//정수를 한글로 바꿔주는 메소드(1204->"일공이사")
	
}
