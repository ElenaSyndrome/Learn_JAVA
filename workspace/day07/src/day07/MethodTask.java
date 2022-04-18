package day07;

import java.util.Scanner;

public class MethodTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask m = new MethodTask();
		
		m.print1To10();
		
		System.out.println("1���� 10������ ��: "+m.sum1To10());
		
		System.out.println("1���� N������ ��: "+m.sum1ToN(100));
		
		System.out.println("�� ������ ������: "+m.div(10, 3));
		
//		System.out.println(m.changeToUpperCase("hEllO@%!%125!"));
		System.out.println("hEllO@%!%125!".toUpperCase());
		
		m.printReverse("HELLO");
	
		System.out.println(m.changeToHangle(1024));
		
	}
	
	//1~10���� ����ϴ� �޼ҵ�
	void print1To10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
	}
//	====================================
	
	//1~10���� �� �����ִ� �޼ҵ�
	int sum1To10() {
		int sum =0;
		for (int i = 0; i < 10; i++) {
			sum += i+1;
		}
		return sum;
	}
//	======================================
	
	//n�� ����ϴ� �κп��� �Է¹��� �� �� �Ѱܹޱ�
	//1~n���� �� �����ִ� �޼ҵ�
	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += i+1;
		}
		return sum;
	}
//	========================================
	//�� ������ ������ ��� �����ִ� �޼ҵ�
	double div(int num1, int num2) {
		return (double)num1/num2;
	}
//	=========================================
	//���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲ��ִ� �޼ҵ�("hEllo"->"HELLO")
	String changeToUpperCase(String msg) {
		String result="";
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i); //�޾ƿ� ���ڿ��� �ѱ��ھ� ��������
//			'a' : 97 	'A' : 65
//			'z'	: 122	'Z' : 90
			if('a'<=ch && ch<='z') {//97<=ch && ch<=122, ���迬���ھ��� �ƽ�Ű�ڵ� ���ڷ� �ٲ�
				result += (char)(ch-32); //32�� ���� �빮�� �ƽ�Ű�ڵ尡 ��.
			} //�ҹ����϶� �빮�ڷ� �ٲ㼭 ����
			else { //�ҹ��ڰ� �ƴ� ���� �׳� ����
				result+=ch;
			}
		}
		return result;
	}
//	=============================================
	//���ڿ� �Ųٷ� ����ϴ� �޼ҵ�("HELLO" -> "OLLEH")
	void printReverse(String msg) {
		String result ="";
		for (int i = msg.length()-1; i >= 0; i--) { //�ε����� 0���� �����ϹǷ� -1
			char ch = msg.charAt(i);
			result += ch;
		}
		System.out.println(result);
	}
//	===============================================
	
	//������ �ѱ۷� �ٲ��ִ� �޼ҵ�(1204->"�ϰ��̻�")
	String changeToHangle(int num) {
//						 01 23 45 67 89
		String hangle = "�����̻�����ĥ�ȱ�";
		String data = num+""; //"1024" ���ڿ� Ÿ������ �ٲ���
		String result="";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i); // '1'
			//'1' -> 1 ���� 1�� ���� 1�� �ٲٱ�
			// 49 - 48 : 1
			//'0' -> 0
			// 48 - 48 : 0
			int index = ch-48; //1024, ���ڷ� �ٲ� ���� index�� �־���.
			result += hangle.charAt(index); //index�����ͼ� result�� ����
			// hangle�� 0������ �̾Ƴ��� '��'
		} 
		return result;
	}
	
}
