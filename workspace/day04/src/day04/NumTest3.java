package day04;

public class NumTest3 {
	public static void main(String[] args) {
		int data=10;
		//전위형
		System.out.println(++data); //11
		System.out.println(data);
		
		//후위형
		data=10;
		System.out.println(data++);//10
		System.out.println(data);//11
	}
}
