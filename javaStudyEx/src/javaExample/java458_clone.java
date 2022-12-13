package javaExample;


public class java458_clone {

	public static void main(String[] args) {
		// Object 클래스의 clone() 메서드
		/* 자신을 복제해서 새로운 인스턴스를 생성하는 일을 한다.
		 * */
		Point original = new Point(3,5);
		Point copy = (Point)original.clone();
		System.out.println(original);
		System.out.println(copy);
		
	}

}

// Cloneable 인터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다.
// 이 인터페이스를 구현하지 않고 clone() 을 호출하면 예외가 발생한다.
class Point implements Cloneable {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	protected Point clone(){
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return (Point)obj;
	}
	
	
	
	
	
	
}