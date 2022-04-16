package day06;

import java.util.Scanner;

public class Gucci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a_cate = "1. 의류\n2. 지갑\n3. 가방\n4. 뒤로가기";
		String b_cate = "1. 재킷&코트\n2. 셔츠\n3. 팬츠&쇼츠\n4. 뒤로가기";
		// 남성_코트_상품명이 담길 배열
		String[] m_c_pName = { "gucci Boutique 라벨 울 트렌치 코트", "패치가 장식된 울 코트", "리버시블 GG 울 판초", "떡볶이 코트" };
		// 남성_코트_상품가격이 담길 배열
		int[] m_c_Price = { 42000, 34000, 164000, 50000 };

		// 회원이 담은 상품들의 총액을 담을 변수
		int total = 0;

		// 회원이 갖고 있는 총 금액
		int money = 10000000;

		// 고른 상품명들을 계속 이어서 연결해 줄 변수
		String basket = "";

		// 나가기가 가능한지 여부를 담아줄 flag
		// flag: 깃발(어느 부분에 들어갔는지를 체크해주는 기법)
		boolean flag = false;

		System.out.println("어서오세요 GUCCI 온라인 샵입니다.");
		while (true) {
			// 메인 메뉴 시작
			System.out.println("1. 남성\n2. 여성\n3. 나가기");
			int choice = sc.nextInt();
			if (choice == 3) {
				// 나가기(결제가 완료 되거나 혹은 결제할 금액이 없을때만 가능)
				if (total != 0) {// 총금액이 0이 아니면 결제하기
					// 결제할 금액이 남아있는 상태
					System.out.println("장바구니에 담긴 상품\n" + basket);
					System.out.println("결제할 총액: " + total + "원");
					if (money >= total) { // 갖고있는 돈이 총금액보다 크거나 같으면 결제 가능
						// 회원이 갖고있는 금액이 총액보다 큰 경우 결제 가능
						money -= total; // money = money - total;
						System.out.println(total + "원 결제가 완료되었습니다.");
						// 결제가 완료되었으므로 총액은 0원으로 초기화
						total = 0; // 결제 후 total을 0으로
						System.out.println("현재 잔액: " + money + "원");
						// 나가기 가능한 상태이므로 깃발을 들어주기(true값으로 바꾸어주기)
						flag = true;
					} else {
						// 회원이 갖고 있는 금액이 총액보다 작은 경우(결제 불가능)
						System.out.println("잔액이 부족합니다.");
					}
				} else { // 총금액이 0 ,고른 상품이 없음
					//total == 0인 상태는 결제할 상품이 없다는 뜻
					System.out.println("결제할 상품이 없습니다.");
					flag = true; // 나가기
				}
				//이 부분까지 왔는데 flag가 true라는 뜻은 나가기 가능한 상태이다.
				if (flag) { // flag가 true면 결제가 됐으니 나가기
					System.out.println("안녕히가세요");
					break; // while문에서 나갈 수 있게 switch문 밖에 탈출구 작성
				}
			}//나가기가 아닌 다른 메뉴들 처리
			switch (choice) {
			case 1:
				// 남성
				while (true) {
					System.out.println(a_cate);
					// 변수의 재사용
					// 장점: 메모리 효율
					// 단점: 가독성이 떨어진다.
					choice = sc.nextInt();
					if (choice == 4) {
						//뒤로가기
						System.out.println("메인으로 돌아갑니다.");
						break;// while문 탈출
					}
					//뒤로가기를 제외한 카테고리들 처리
					switch (choice) {
					case 1:
						// 의류
						while (true) {
							//의류에 관련된 카테고리 출력
							System.out.println(b_cate);
							int bchoice = sc.nextInt();
							if (bchoice == 4) {
								// 뒤로가기
								break;
							}
							// 뒤로가기를 제외한 카테고리 처리
							switch (bchoice) {
							case 1:
								// 코트
								// 남성 > 의류 > 코트
								// 남성_코트_상품명 배열을 반복하며 각 방에 있는 값들을 출력해준다. (상품명 출력)
								// 그와 동시에 남성_코트_가격 배열의 각 방에 담겨있는 값도 같이 출력해준다. (해당상품 가격 출력)
								for (int i = 0; i < m_c_pName.length; i++) {
									// 1. 상품명1 : ~~~원
									// 2. 상품명2 : ~~~원
									System.out.println(i + 1 + ". " + m_c_pName[i] + " : " + m_c_Price[i] + "원");
								}
								// 상품 선택을 담아줄 변수 
								int pChoice = sc.nextInt();
								// 실제 고른 번호보다 -1 방이 실제 이름과 가격이 담겨있는 곳이다. 
								total += m_c_Price[pChoice - 1]; //total에 가격누적
								basket += m_c_pName[pChoice - 1] + "\n"; // 장바구니에 상품 누적
								
								System.out.println(m_c_pName[pChoice - 1] + " 상품을 장바구니에 담았습니다.");
								System.out.println("총액: " + total + "원");
								break;
							case 2:
								// 셔츠
								break;
							case 3:
								// 팬츠
								break;
							}
						}
						break;
					case 2:
						// 지갑
						break;
					case 3:
						// 가방
						break;
					}
				}
				break; // 탈출
			case 2:
				// 여성
				while (true) {
					System.out.println(a_cate);
					choice = sc.nextInt();
					if (choice == 4) {
						System.out.println("메인으로 돌아갑니다.");
						break;// while문 탈출
					}
					switch (choice) {
					case 1:
						// 의류
						break;
					case 2:
						// 지갑
						break;
					case 3:
						// 가방
						break;
					}
				}
				break;
			case 3:
				//나가기 선택시 if(choice==3) 부분으로 들어가는데
				//만약 결제할 금액이 부족해서 break를 만나지 못했다면
				//switch문으로 내려오게된다. 따라서 case 3: 만들어주지 않는다면
				//default로 가게되고 "잘못 입력하셨습니다."가 나온다.
				//이를 방지하기 위해 case 3: 을 만들어주고 아무 행위도 하지 않게 놔둔다.
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
