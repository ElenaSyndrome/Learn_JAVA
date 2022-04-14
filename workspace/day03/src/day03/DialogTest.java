package day03;

import javax.swing.JOptionPane;

public class DialogTest {
	public static void main(String[] args) {
//		대화상자 띄우기
//		JOptionPane.showMessageDialog(null, "어서오세요");
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		JOptionPane.showMessageDialog(null, name+"님 환영합니다.");
//		String num1 = JOptionPane.showInputDialog("첫번째 정수");
//		String num2 = JOptionPane.showInputDialog("두번째 정수");
		
		//문자열을 정수나 실수로 형변환을 하기위해서는, 형변환 연산자를 사용하는것이 아니라
		//메소드를 이용해야 한다. 
//		Integer.parseInt("정수로 이루어진 문자열"); : 문자열을 int형으로 형변환
		
//		int realNum1 = Integer.parseInt(num1);
//		double realNum2 = Double.parseDouble(num2);
//		JOptionPane.showMessageDialog(null, num1+"/"+num2+"="+(realNum1/realNum2));
	
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("첫번째정수"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("두번째정수"));
		JOptionPane.showMessageDialog(null, num1+"/"+(int)num2+"="+(num1/num2));
	
		Integer.parseInt("20");//20
	}
}
