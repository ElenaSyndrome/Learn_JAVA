package day08;

public class Ground {
	public static void main(String[] args) {
		//동물 세마리 객체화 후 기능 하나씩 사용하기
		Animal hamster = new Animal("밥풀이", "암컷", 10);
		Animal cat = new Animal("보름이", "수컷", 4);
		Animal whale = new Animal("흰수염", "수컷", 50);
		
		cat.move();
		hamster.move();
		whale.move();
	}
}

//동물 클래스
//이름, 성별, 나이
//먹기, 자기, 움직이기, 울기

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
		System.out.println(name + "은(는) 냠냠 먹는중~");
	}
	
	void sleep() {
		System.out.println(name+"은(는) 쿨쿨 잠자는중~");
	}
	
	void move() {
		System.out.println(name+"은(는) 쿵쾅쿵쾅 움직이는중~");
	}
	
	void cry() {
		System.out.println(name+"은(는) 엉엉 우는중~");
	}
}