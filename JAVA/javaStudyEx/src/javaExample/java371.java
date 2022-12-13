package javaExample;
import java.util.Vector;

public class java371 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv2());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();
	}

}
//---------------------------------------------------------------------------------
class Product { 		//슈퍼 클래스
	int price; 			// 제품의 가격
	int bonusPoint; 	// 제품 구매 시 제공하는 보너스 점수
	Product (int price) { this.price = price; bonusPoint = (int)(price/10.0); }
	Product () {}
}
class Tv2 extends Product {
	Tv2() { super(100); }
	@Override
	public String toString() { return "Tv"; }
}
class Computer extends Product {
	Computer() { super(200); }
	@Override
	public String toString() { return "Computer"; }
}
class Audio extends Product {
	Audio () { super(50); }
	@Override
	public String toString() { return "Audio"; }
}
//----------------------------------------------------------------------------------

class Buyer { 							// 물건 사는 사람
	int money = 1000; 					// 소유 금액
	int bonusPoint = 0; 				// 보너스 점수
	Vector<Product> item = new Vector<Product>();	// 구입한 제품 저장 배열
	
	void buy (Product p) {
		if(money < p.price) { 			// 제품이 가진돈보다 비쌀때
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		//가진돈이 더 많을때
		this.money -= p.price; 			 // 바이어의 돈에서 구입한 제품의 가격을뺌
		this.bonusPoint += p.bonusPoint; //구매한 제품의 보너스 포인트를 더해준다.
		item.add(p);
		System.out.println(p + "을/를 구매하였습니다.");
	}
	
	// 제품 환불 메서드 refund
	void refund(Product p) {
		if(item.remove(p)) { // 삭제에 성공하면 true 반환
			money += p.price; // 제품금액 바이어에게 돌려주기
			bonusPoint -= p.bonusPoint; // 제품보너스포인트 바이어 보너스포인트에서 차감
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() { 			// 구매한 물품 정보 요약
		int sum = 0; 			// 구입한 물품의 가격 합계
		String itemList = ""; 	//구입한 물품 목록
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
		
	}
}































