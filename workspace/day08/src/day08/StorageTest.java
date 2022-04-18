package day08;

public class StorageTest {
	int data=20;
	static int s_data;
	public static void main(String[] args) { //정적메소드
		StorageTest s = new StorageTest();
//		int data = 10;
//		s.init(data);
		
		//static메소드에서는 일반 전역변수를 사용할 수 없다. 
//		System.out.println(data);
		System.out.println(s_data);
	}
	
	void init(int data) {
		data+=10;
	}
	void init2() {
		System.out.println(data); //전역변수 20
	}
	void init3() {
		System.out.println(data); //전역변수 20
	}
}
