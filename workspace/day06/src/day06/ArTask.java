package day06;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//for���� �̿��ؼ� �迭�� 1~10���� �ְ� ����ϱ�
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//		}
//
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
// ---------------------------------------------------
		
		//for���� �̿��ؼ� �迭�� 10~1���� �ְ� ����ϱ� 
		
//		int[] arData2 = new int[10];
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i] = 10-i;
//		}
//		
//		for (int i = 0; i < arData2.length; i++) {
//			System.out.println(arData2[i]);
//		}
// ---------------------------------------------------
		
		//for���� �̿��ؼ� ����ڿ��� ���� 5�� �Է¹ް� ���ձ��ϱ�
		Scanner sc = new Scanner(System.in);
//		int[] arNum = new int[5];
//		for (int i = 0; i < arNum.length; i++) {
//			System.out.print("�����Է�: ");
//			arNum[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for (int i = 0; i < arNum.length; i++) {
//			sum += arNum[i];
//		}
//		System.out.println("����:" + sum);
// ---------------------------------------------------
		
		//����,����,����,����,�ѱ��� ���� �Է¹ް�
		//����, ��� �����ֱ�
		//��������:
		//��������:
		String[] subjects = {"����","����","����","����","�ѱ���","�ڹ�"};
		int[] arScore = new int[subjects.length];
		for (int i = 0; i < arScore.length; i++) {
			System.out.print(subjects[i]+"����: ");
			arScore[i] = sc.nextInt();
		}
		int tot = 0;
		for (int i = 0; i < arScore.length; i++) {
			tot += arScore[i];
		}
		System.out.println("����:" + tot +"��");
		System.out.println("���:" + tot/(double)arScore.length +"��");
		
		
		
	}
}
