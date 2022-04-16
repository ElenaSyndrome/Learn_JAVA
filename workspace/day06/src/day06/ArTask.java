package day06;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
		//for문을 이용해서 배열에 1~10까지 넣고 출력하기
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//		}
//
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
// ---------------------------------------------------
		
		//for문을 이용해서 배열에 10~1까지 넣고 출력하기 
		
//		int[] arData2 = new int[10];
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i] = 10-i;
//		}
//		
//		for (int i = 0; i < arData2.length; i++) {
//			System.out.println(arData2[i]);
//		}
// ---------------------------------------------------
		
		//for문을 이용해서 사용자에게 숫자 5개 입력받고 총합구하기
		Scanner sc = new Scanner(System.in);
//		int[] arNum = new int[5];
//		for (int i = 0; i < arNum.length; i++) {
//			System.out.print("정수입력: ");
//			arNum[i] = sc.nextInt();
//		}
//		int sum = 0;
//		for (int i = 0; i < arNum.length; i++) {
//			sum += arNum[i];
//		}
//		System.out.println("총합:" + sum);
// ---------------------------------------------------
		
		//국어,수학,영어,과학,한국사 점수 입력받고
		//총점, 평균 구해주기
		//국어점수:
		//수학점수:
		String[] subjects = {"국어","수학","영어","과학","한국사","자바"};
		int[] arScore = new int[subjects.length];
		for (int i = 0; i < arScore.length; i++) {
			System.out.print(subjects[i]+"점수: ");
			arScore[i] = sc.nextInt();
		}
		int tot = 0;
		for (int i = 0; i < arScore.length; i++) {
			tot += arScore[i];
		}
		System.out.println("총점:" + tot +"점");
		System.out.println("평균:" + tot/(double)arScore.length +"점");
		
		
		
	}
}
