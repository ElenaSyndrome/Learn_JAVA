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
		
//		System.out.println(m.changeToUpperCase("hEllO@%!%125!"));
		System.out.println("hEllO@%!%125!".toUpperCase());
		
		m.printReverse("HELLO");
	
		System.out.println(m.changeToHangle(1024));
		
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
	//문자열의 소문자를 대문자로 바꿔주는 메소드("hEllo"->"HELLO")
	String changeToUpperCase(String msg) {
		String result="";
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i); //받아온 문자열을 한글자씩 가져오기
//			'a' : 97 	'A' : 65
//			'z'	: 122	'Z' : 90
			if('a'<=ch && ch<='z') {//97<=ch && ch<=122, 관계연산자쓰면 아스키코드 숫자로 바뀜
				result += (char)(ch-32); //32를 빼면 대문자 아스키코드가 됨.
			} //소문자일땐 대문자로 바꿔서 연결
			else { //소문자가 아닐 때는 그냥 연결
				result+=ch;
			}
		}
		return result;
	}
//	=============================================
	//문자열 거꾸로 출력하는 메소드("HELLO" -> "OLLEH")
	void printReverse(String msg) {
		String result ="";
		for (int i = msg.length()-1; i >= 0; i--) { //인덱스가 0부터 시작하므로 -1
			char ch = msg.charAt(i);
			result += ch;
		}
		System.out.println(result);
	}
//	===============================================
	
	//정수를 한글로 바꿔주는 메소드(1204->"일공이사")
	String changeToHangle(int num) {
//						 01 23 45 67 89
		String hangle = "공일이삼사오육칠팔구";
		String data = num+""; //"1024" 문자열 타입으로 바꿔줌
		String result="";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i); // '1'
			//'1' -> 1 문자 1을 숫자 1로 바꾸기
			// 49 - 48 : 1
			//'0' -> 0
			// 48 - 48 : 0
			int index = ch-48; //1024, 숫자로 바뀐 것을 index에 넣어줌.
			result += hangle.charAt(index); //index꺼내와서 result에 연결
			// hangle의 0번방을 뽑아내면 '공'
		} 
		return result;
	}
	
}
