package ex05_09;

import java.util.ArrayList;

public class Ex7 {

	public static void main(String[] args) {
		// 230p
		
		// Q1) 정답: 같은
		// 배열은 XXX 자료형을 순서대로 관리할때 사용하는 자료 구조 입니다.
		
		// Q3)
		// 배열의 길이가 5인 정수형 배열을 선언하고,
		// 1 ~ 10 중 짝수만을 배열에 저장한 후 그 합을 출력하세요.
		int[] nums = new int[5];
		
		int index = 0;
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				nums[index] = i;
				index++;
			}
		}
		
		int total = 0;
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		System.out.println(total);
		
		// Q4) for문, 향상된 for문 
//		int[] arr 		= {1, 2, 3, 4, 5};
//		String[] strArr = {"a", "b", "c", "d", "e"};
//		String[] strArr2= {new String("a"), new String("b"), new String("c")};
//		Dog[] dogs 		= {new Dog("뽀삐", "시추"), new Dog("배추", "푸들")};
		
		Dog[] dogs = new Dog[5];
		dogs[0] = new Dog("뽀삐", "시추");
		dogs[1] = new Dog("배추", "푸들");
		dogs[2] = new Dog("토토", "말티즈");
		dogs[3] = new Dog("누렁이", "진돗개");
		dogs[4] = new Dog("똥강아지", "잡종");
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("-----------------------");
		// Q5) 
		// ArrayList를 활용하여 위로직을 구현
//		ArrayList<Integer> arr2 = new ArrayList<Integer>();
//		arr2.add(10);
		ArrayList<Dog> arr = new ArrayList<Dog>();
		arr.add(new Dog("뽀삐", "시추"));
		arr.add(new Dog("배추", "푸들"));
		arr.add(new Dog("토토", "말티즈"));
		arr.add(new Dog("누렁이", "진돗개"));
		arr.add(new Dog("똥강아지", "잡종"));
		arr.add(new Dog("코코", "말티푸"));
		
		for(int i=0; i < arr.size(); i++) {
			Dog dog = arr.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		System.out.println("-----------------------");
		
//		for(Dog dog : dogs) {
//			System.out.println(dog.showDogInfo());
//		}
		for(Dog dog : arr) {
			System.out.println(dog.showDogInfo());
		}
		
	}

}

// Q4)
// 다음과 같이 Dog 클래스가 있습니다.
// 배열 길이가 5인 Dog[] 배열을 만든 후 Dog 인스턴스를 5개 생성하여
// 배열에 추가합니다. for문과 향상된 for문에서 Dog 클래스의
// showDogInfo() 메서드를 사용하여 배열에 추가된 Dog 정보를 모두 출력하세요.
// < 출력 예시 >
// 뽀삐, 시추
// 배추, 푸들
// 토토, 말티즈
// 누렁이, 진돗개...
class Dog {
	private String name;
	private String type;
	
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() {
		return name + ", " + type;
	}
	
}













