package day05;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		/*while(choice!=3) {//choice�� 3�� �ƴϸ� �ݺ���
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1. C���\n2. JAVA\n3. ���վ�\n4. ���̽�");
			choice = sc.nextInt();
			if(choice==3) {
				System.out.println("�����Դϴ�.");
			}
			else if(choice==1 || choice==2 || choice==4) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}*/
		/*do{
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1. C���\n2. JAVA\n3. ���վ�\n4. ���̽�\n0. ������");
			choice = sc.nextInt();
			if(choice==3) {
				System.out.println("�����Դϴ�.");
			}
			else if(choice==1 || choice==2 || choice==4) {
				System.out.println("�����Դϴ�.");
			}
			else if(choice==0){
				System.out.println("������ �� ������~!");
			}
			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}while(choice!=0);
		System.out.println("���α׷��� �����մϴ�.");
		*/
		while(true){
			System.out.println("���� �� ���α׷��� �� �ƴ� ����?");
			System.out.println("1. C���\n2. JAVA\n3. ���վ�\n4. ���̽�\n0. ������");
			choice = sc.nextInt();
			if(choice==3) {
				System.out.println("�����Դϴ�.");
			}
			else if(choice==1 || choice==2 || choice==4) {
				System.out.println("�����Դϴ�.");
			}
			else if(choice==0){
				System.out.println("������ �� ������~!");
				break;
			}
			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
