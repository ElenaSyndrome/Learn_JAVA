package day08;

public class Road {
//	String myCarBrand = "BMW";
//	String myCarColor = "Blue";
//	int myCarPrice = 38000;
//	String momCarBrand = "K7";
	
	public static void main(String[] args) {
//		Road r = new Road();
//		r.myCarEngineStart();
		Car mycar = new Car("Benz","Blue",38000); //�̶� this�� mycar
		Car momcar = new Car("K7","White",7000); //�̶� this�� momcar
	
		//static �ʵ�
		mycar.wheel--;
		System.out.println(mycar.wheel); //3
		System.out.println(momcar.wheel); //3
		System.out.println(Car.wheel); //3
		//static�� ��� ��ü�� �����ϹǷ� ���� ��ü�� �������� �ʰ�
		//Car Ŭ�����ε� ������ �����ϴ�.
		
//		new Car().engineStart();
//		System.out.println(mycar);
//		A.b : A���� b, A�� b
		mycar.engineStart();
//		mycar.brand="Benz";
//		mycar.color="Blue";
//		mycar.price=38000;
		System.out.println(mycar.brand);
//	}
	
//	void myCarEngineStart() {
//		System.out.println(myCarBrand+" �õ� �ѱ�");
//	}
//	void myCarEngineStop() {
//		System.out.println(myCarBrand+" �õ� ����");
	}
}

class Car{
	
	String brand;
	String color;
	int price;
	
	//a��� ��ü�� �����Ѵ�.
	static int wheel = 4;
	
	//Alt+Shift+S > O : ���ϴ� ������� ������ �����
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//�⺻�����ڴ� ���ο��� �ƹ��͵� ���� ����. �ܼ��ϰ� �ʵ常 ����� �ּҰ��� ������.
	//�⺻������ �����ڴ� �ʵ带 ����� �ּҰ��� ������ ���� ����Ǿ�����.
	//�����ڵ� �޼ҵ�� ����� ������. ������ �Ű������� ���� �� ����.
	
	void engineStart() {
		System.out.println("�õ� �ѱ�");
	}
	

	void engineStop() {
		System.out.println("�õ� ����");
	}
	
	
}



