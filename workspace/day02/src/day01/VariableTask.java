package day01;

public class VariableTask {
	public static void main(String[] args) {
		//이름 : 홍길동
		//나이 : 10살
		//키 : 180.25cm
		//몸무게 : 75.75kg
		//성적 : A
		
		//data들(180.75, 75.75, ...) 변수에 담고 println으로 출력
		
		String name = "홍길동";
		int age = 10;
		double height= 180.25;
		float weight = 75.75F;
		char score = 'A';
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"살");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("성적 : "+score);
	}
}
