package day07;

public class arrTest {
	public static void main(String[] args) {
		int[][] arrData = { { 10, 20, 30 }, { 40, 50, 60 } };
//		for (int i = 0; i < 6; i++) {
//			//0�� 0�� ~ 1�� 2��
//			//i 	��	��
//			//0		0	0
//			//1		0	1
//			//2		0	2
//			
//			//3		1	0
//			//4		1	1
//			//5		1	2
//			System.out.println(arrData[i/3][i%3]);
		
//		�����ϹǷ� �ึ�� for�� ������(for�� �ΰ��� ���)
//		for (int j = 0; j < 3; j++) {
//			 System.out.println(arrData[0][j]);
//		}
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println(arrData[1][j]);

		//���� ������ŭ �ݺ��Ǵ� for���� ��°�� i for�� �ȿ� �־��ش�.
		for (int i = 0; i < arrData.length; i++) { //0,1
			for (int j = 0; j < arrData[i].length; j++) {//0,1,2
				 System.out.println(arrData[i][j]);
			}
		}
		
		//������ �迭
		int[][] arrData2 = new int[2][];  
		int[][] arrData3 = {{},{10,20,30},{40}};
		arrData[0] = new int[10];
		arrData[1] = new int[2];
		
		

	}
}

