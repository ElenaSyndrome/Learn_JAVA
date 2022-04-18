package day08;

public class Road {
//	String myCarBrand = "BMW";
//	String myCarColor = "Blue";
//	int myCarPrice = 38000;
//	String momCarBrand = "K7";
	
	public static void main(String[] args) {
//		Road r = new Road();
//		r.myCarEngineStart();
		Car mycar = new Car("Benz","Blue",38000); //이때 this는 mycar
		Car momcar = new Car("K7","White",7000); //이때 this는 momcar
	
		//static 필드
		mycar.wheel--;
		System.out.println(mycar.wheel); //3
		System.out.println(momcar.wheel); //3
		System.out.println(Car.wheel); //3
		//static은 모든 객체가 공유하므로 굳이 객체로 접근하지 않고
		//Car 클래스로도 접근이 가능하다.
		
//		new Car().engineStart();
//		System.out.println(mycar);
//		A.b : A안의 b, A의 b
		mycar.engineStart();
//		mycar.brand="Benz";
//		mycar.color="Blue";
//		mycar.price=38000;
		System.out.println(mycar.brand);
//	}
	
//	void myCarEngineStart() {
//		System.out.println(myCarBrand+" 시동 켜기");
//	}
//	void myCarEngineStop() {
//		System.out.println(myCarBrand+" 시동 끄기");
	}
}

class Car{
	
	String brand;
	String color;
	int price;
	
	//a모든 객체가 공유한다.
	static int wheel = 4;
	
	//Alt+Shift+S > O : 원하는 변수대로 생성자 만들기
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//기본생성자는 내부에서 아무것도 하지 않음. 단순하게 필드만 만들고 주소값만 가져옴.
	//기본적으로 생성자는 필드를 만들고 주소값을 가지고 오게 설계되어있음.
	//생성자도 메소드와 기능이 동일함. 때문에 매개변수를 넣을 수 있음.
	
	void engineStart() {
		System.out.println("시동 켜기");
	}
	

	void engineStop() {
		System.out.println("시동 끄기");
	}
	
	
}



