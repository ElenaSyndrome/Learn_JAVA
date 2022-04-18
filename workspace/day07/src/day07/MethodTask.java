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
	//���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲ��ִ� �޼ҵ�("hEllo" -> "HELLO")
	//���ڿ� �Ųٷ� ����ϴ� �޼ҵ�("HELLO" -> "OLLEH")
	//������ �ѱ۷� �ٲ��ִ� �޼ҵ�(1204->"�ϰ��̻�")
	
}
