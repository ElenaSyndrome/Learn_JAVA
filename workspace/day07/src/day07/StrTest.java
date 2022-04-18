package day07;

public class StrTest {
	public static void main(String[] args) {
		String msg = "Hello Java!";
		//"문자열1".split("문자열2") : "문자열1"을 "문자열2" 기준으로 나누기
//									통째로가 나누어진 값들이 담긴 String[]
//		String msg2 = "Hello.Java!";
//		System.out.println(msg2.split("[.]")[0]);
		
		String[] datas = msg.split(" ");//나누는 기준점
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
	}
}
