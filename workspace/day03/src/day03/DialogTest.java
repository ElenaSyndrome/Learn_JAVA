package day03;

import javax.swing.JOptionPane;

public class DialogTest {
	public static void main(String[] args) {
//		��ȭ���� ����
//		JOptionPane.showMessageDialog(null, "�������");
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		JOptionPane.showMessageDialog(null, name+"�� ȯ���մϴ�.");
//		String num1 = JOptionPane.showInputDialog("ù��° ����");
//		String num2 = JOptionPane.showInputDialog("�ι�° ����");
		
		//���ڿ��� ������ �Ǽ��� ����ȯ�� �ϱ����ؼ���, ����ȯ �����ڸ� ����ϴ°��� �ƴ϶�
		//�޼ҵ带 �̿��ؾ� �Ѵ�. 
//		Integer.parseInt("������ �̷���� ���ڿ�"); : ���ڿ��� int������ ����ȯ
		
//		int realNum1 = Integer.parseInt(num1);
//		double realNum2 = Double.parseDouble(num2);
//		JOptionPane.showMessageDialog(null, num1+"/"+num2+"="+(realNum1/realNum2));
	
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("ù��°����"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("�ι�°����"));
		JOptionPane.showMessageDialog(null, num1+"/"+(int)num2+"="+(num1/num2));
	
		Integer.parseInt("20");//20
	}
}
