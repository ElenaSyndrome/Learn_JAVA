package day08;

public class StorageTest {
	int data=20;
	static int s_data;
	public static void main(String[] args) { //�����޼ҵ�
		StorageTest s = new StorageTest();
//		int data = 10;
//		s.init(data);
		
		//static�޼ҵ忡���� �Ϲ� ���������� ����� �� ����. 
//		System.out.println(data);
		System.out.println(s_data);
	}
	
	void init(int data) {
		data+=10;
	}
	void init2() {
		System.out.println(data); //�������� 20
	}
	void init3() {
		System.out.println(data); //�������� 20
	}
}
