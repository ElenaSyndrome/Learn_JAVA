package day08;

public class Ground {
	public static void main(String[] args) {
		//���� ������ ��üȭ �� ��� �ϳ��� ����ϱ�
		Animal hamster = new Animal("��Ǯ��", "����", 10);
		Animal cat = new Animal("������", "����", 4);
		Animal whale = new Animal("�����", "����", 50);
		
		cat.move();
		hamster.move();
		whale.move();
	}
}

//���� Ŭ����
//�̸�, ����, ����
//�Ա�, �ڱ�, �����̱�, ���

class Animal {
	String name;
	String gender;
	int age;
	
	public Animal(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void eat() {
		System.out.println(name + "��(��) �ȳ� �Դ���~");
	}
	
	void sleep() {
		System.out.println(name+"��(��) ���� ���ڴ���~");
	}
	
	void move() {
		System.out.println(name+"��(��) �������� �����̴���~");
	}
	
	void cry() {
		System.out.println(name+"��(��) ���� �����~");
	}
}