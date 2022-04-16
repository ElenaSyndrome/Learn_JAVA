package day06;

import java.util.Scanner;

public class Gucci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a_cate = "1. �Ƿ�\n2. ����\n3. ����\n4. �ڷΰ���";
		String b_cate = "1. ��Ŷ&��Ʈ\n2. ����\n3. ����&����\n4. �ڷΰ���";
		// ����_��Ʈ_��ǰ���� ��� �迭
		String[] m_c_pName = { "gucci Boutique �� �� Ʈ��ġ ��Ʈ", "��ġ�� ��ĵ� �� ��Ʈ", "�����ú� GG �� ����", "������ ��Ʈ" };
		// ����_��Ʈ_��ǰ������ ��� �迭
		int[] m_c_Price = { 42000, 34000, 164000, 50000 };

		// ȸ���� ���� ��ǰ���� �Ѿ��� ���� ����
		int total = 0;

		// ȸ���� ���� �ִ� �� �ݾ�
		int money = 10000000;

		// �� ��ǰ����� ��� �̾ ������ �� ����
		String basket = "";

		// �����Ⱑ �������� ���θ� ����� flag
		// flag: ���(��� �κп� �������� üũ���ִ� ���)
		boolean flag = false;

		System.out.println("������� GUCCI �¶��� ���Դϴ�.");
		while (true) {
			// ���� �޴� ����
			System.out.println("1. ����\n2. ����\n3. ������");
			int choice = sc.nextInt();
			if (choice == 3) {
				// ������(������ �Ϸ� �ǰų� Ȥ�� ������ �ݾ��� �������� ����)
				if (total != 0) {// �ѱݾ��� 0�� �ƴϸ� �����ϱ�
					// ������ �ݾ��� �����ִ� ����
					System.out.println("��ٱ��Ͽ� ��� ��ǰ\n" + basket);
					System.out.println("������ �Ѿ�: " + total + "��");
					if (money >= total) { // �����ִ� ���� �ѱݾ׺��� ũ�ų� ������ ���� ����
						// ȸ���� �����ִ� �ݾ��� �Ѿ׺��� ū ��� ���� ����
						money -= total; // money = money - total;
						System.out.println(total + "�� ������ �Ϸ�Ǿ����ϴ�.");
						// ������ �Ϸ�Ǿ����Ƿ� �Ѿ��� 0������ �ʱ�ȭ
						total = 0; // ���� �� total�� 0����
						System.out.println("���� �ܾ�: " + money + "��");
						// ������ ������ �����̹Ƿ� ����� ����ֱ�(true������ �ٲپ��ֱ�)
						flag = true;
					} else {
						// ȸ���� ���� �ִ� �ݾ��� �Ѿ׺��� ���� ���(���� �Ұ���)
						System.out.println("�ܾ��� �����մϴ�.");
					}
				} else { // �ѱݾ��� 0 ,�� ��ǰ�� ����
					//total == 0�� ���´� ������ ��ǰ�� ���ٴ� ��
					System.out.println("������ ��ǰ�� �����ϴ�.");
					flag = true; // ������
				}
				//�� �κб��� �Դµ� flag�� true��� ���� ������ ������ �����̴�.
				if (flag) { // flag�� true�� ������ ������ ������
					System.out.println("�ȳ���������");
					break; // while������ ���� �� �ְ� switch�� �ۿ� Ż�ⱸ �ۼ�
				}
			}//�����Ⱑ �ƴ� �ٸ� �޴��� ó��
			switch (choice) {
			case 1:
				// ����
				while (true) {
					System.out.println(a_cate);
					// ������ ����
					// ����: �޸� ȿ��
					// ����: �������� ��������.
					choice = sc.nextInt();
					if (choice == 4) {
						//�ڷΰ���
						System.out.println("�������� ���ư��ϴ�.");
						break;// while�� Ż��
					}
					//�ڷΰ��⸦ ������ ī�װ��� ó��
					switch (choice) {
					case 1:
						// �Ƿ�
						while (true) {
							//�Ƿ��� ���õ� ī�װ� ���
							System.out.println(b_cate);
							int bchoice = sc.nextInt();
							if (bchoice == 4) {
								// �ڷΰ���
								break;
							}
							// �ڷΰ��⸦ ������ ī�װ� ó��
							switch (bchoice) {
							case 1:
								// ��Ʈ
								// ���� > �Ƿ� > ��Ʈ
								// ����_��Ʈ_��ǰ�� �迭�� �ݺ��ϸ� �� �濡 �ִ� ������ ������ش�. (��ǰ�� ���)
								// �׿� ���ÿ� ����_��Ʈ_���� �迭�� �� �濡 ����ִ� ���� ���� ������ش�. (�ش��ǰ ���� ���)
								for (int i = 0; i < m_c_pName.length; i++) {
									// 1. ��ǰ��1 : ~~~��
									// 2. ��ǰ��2 : ~~~��
									System.out.println(i + 1 + ". " + m_c_pName[i] + " : " + m_c_Price[i] + "��");
								}
								// ��ǰ ������ ����� ���� 
								int pChoice = sc.nextInt();
								// ���� �� ��ȣ���� -1 ���� ���� �̸��� ������ ����ִ� ���̴�. 
								total += m_c_Price[pChoice - 1]; //total�� ���ݴ���
								basket += m_c_pName[pChoice - 1] + "\n"; // ��ٱ��Ͽ� ��ǰ ����
								
								System.out.println(m_c_pName[pChoice - 1] + " ��ǰ�� ��ٱ��Ͽ� ��ҽ��ϴ�.");
								System.out.println("�Ѿ�: " + total + "��");
								break;
							case 2:
								// ����
								break;
							case 3:
								// ����
								break;
							}
						}
						break;
					case 2:
						// ����
						break;
					case 3:
						// ����
						break;
					}
				}
				break; // Ż��
			case 2:
				// ����
				while (true) {
					System.out.println(a_cate);
					choice = sc.nextInt();
					if (choice == 4) {
						System.out.println("�������� ���ư��ϴ�.");
						break;// while�� Ż��
					}
					switch (choice) {
					case 1:
						// �Ƿ�
						break;
					case 2:
						// ����
						break;
					case 3:
						// ����
						break;
					}
				}
				break;
			case 3:
				//������ ���ý� if(choice==3) �κ����� ���µ�
				//���� ������ �ݾ��� �����ؼ� break�� ������ ���ߴٸ�
				//switch������ �������Եȴ�. ���� case 3: ��������� �ʴ´ٸ�
				//default�� ���Եǰ� "�߸� �Է��ϼ̽��ϴ�."�� ���´�.
				//�̸� �����ϱ� ���� case 3: �� ������ְ� �ƹ� ������ ���� �ʰ� ���д�.
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
