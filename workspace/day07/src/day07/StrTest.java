package day07;

public class StrTest {
	public static void main(String[] args) {
		String msg = "Hello Java!";
		//"���ڿ�1".split("���ڿ�2") : "���ڿ�1"�� "���ڿ�2" �������� ������
//									��°�ΰ� �������� ������ ��� String[]
//		String msg2 = "Hello.Java!";
//		System.out.println(msg2.split("[.]")[0]);
		
		String[] datas = msg.split(" ");//������ ������
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
	}
}
