package day06;

public class ArTest {
	public static void main(String[] args) {
		// �迭����1
		int[] arData = { 10, 20, 30, 40, 50, 60 };
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
//		for(int i=0; i<arData.length; i++) {
//			System.out.println(arData[i]);
//		}

		// �迭����2 ĭ�� ���ϰ� ���߿� ���� �ֱ�
		int[] arData2 = new int[5];
//		arData2[0] = 10;
//		arData2[1] = 20;
//		arData2[2] = 30;
//		arData2[3] = 40;
//		arData2[4] = 50;
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i]=(i+1)*10;
//		}
//		for (int i = 0; i < arData2.length; i++) {
//			System.out.println(arData2[i]);
//		}

		// �迭����3 �� ĭ������ �𸦶�
		int[] arData3 = null;
		arData3 = new int[5];
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = (i + 1) * 10;
		}
		for (int i = 0; i < arData3.length; i++) {
			System.out.println(arData3[i]);
		}
		System.out.println(arData3[5]);
	}
}
