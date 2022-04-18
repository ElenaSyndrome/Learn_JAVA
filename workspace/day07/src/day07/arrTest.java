package day07;

public class arrTest {
	public static void main(String[] args) {
		int[][] arrData = { { 10, 20, 30 }, { 40, 50, 60 } };
//		for (int i = 0; i < 6; i++) {
//			//0행 0열 ~ 1행 2열
//			//i 	행	열
//			//0		0	0
//			//1		0	1
//			//2		0	2
//			
//			//3		1	0
//			//4		1	1
//			//5		1	2
//			System.out.println(arrData[i/3][i%3]);
		
//		복잡하므로 행마다 for문 나누기(for문 두개로 출력)
//		for (int j = 0; j < 3; j++) {
//			 System.out.println(arrData[0][j]);
//		}
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[1][j]);

		//행의 갯수만큼 반복되는 for문을 통째로 i for문 안에 넣어준다.
		for (int i = 0; i < arrData.length; i++) { //0,1
			for (int j = 0; j < arrData[i].length; j++) {//0,1,2
				 System.out.println(arrData[i][j]);
			}
		}
		
		//비정방 배열
		int[][] arrData2 = new int[2][];  
		int[][] arrData3 = {{},{10,20,30},{40}};
		arrData[0] = new int[10];
		arrData[1] = new int[2];
		
		

	}
}

