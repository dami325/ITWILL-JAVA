package static_;

class Road {
	// 멤버변수, 필드, 속성
	int[] arr;
	
	// 기능 (메서드)
	public int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += this.arr[i];
		}
		return sum;
	}
	
}

class Bridge {
	// 멤버변수, 필드, 속성
	int index;
	int total;
	
	// 소요시간(total)이 가장 적게 걸리는 다리를 리턴 해주는 메서드
	public static Bridge min(Bridge[] bridges) {
		Bridge minBridge = bridges[0];
		
		for(int i = 1; i < bridges.length; i++) {
			if(minBridge.total > bridges[i].total) {
				minBridge = bridges[i];
			}
		}
		return minBridge;
	}
}


public class Test1 {

	public static void main(String[] args) {
		/*
		 * 도로 교통 상황이 숫자로 주어진다.
		 * 
		 * 출발 70 80 60 20 30 50 10 80 77 89
		 *           ||    ||    ||
		 *     70 60 40 50 55 65 23 44 37 88 도착
		 * 
		 * 북 쪽에서 남쪽 다리 index 번호가 주어진다.
		 * 이때, 가장 최소 시간이 소요되는 다리는 몇번 다리인지 출력하고 최소시간을 함께 출력해보자!
		 * 
		 * 출력예시) 다리번호: 6
		 * 		   최소시간: 512
		 * 
		 * 주의사항.
		 * 1. 무조건 다리를 1번 건너야함 (도착지점이 남쪽이기 때문에)
		 * 2. 다리를 여러번 건널수 없고 딱, 한번만 가능
		 * 3. 다리를 건널때에는 남쪽, 북쪽 소요시간이 같이 소요됨. (즉, 같이 합산해야함)
		 * 4. 소요시간이 같은 경우 발생하면 낮은 다리번호를 출력
		 * 
		 * */
		Road north = new Road();
		north.arr = new int[] {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
		
		Road south = new Road();
		south.arr = new int[] {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
		
		Bridge bridge1 = new Bridge();
		Bridge bridge2 = new Bridge();
		Bridge bridge3 = new Bridge();
		bridge1.index = 2;
		bridge2.index = 4;
		bridge3.index = 6;
		
		Bridge[] bridges = {bridge1, bridge2, bridge3};
		
		for(Bridge b : bridges) {
			b.total = north.sum(0, b.index) + south.sum(b.index, south.arr.length - 1);
		}
		
		Bridge min = Bridge.min(bridges);
		System.out.println("다리번호: " + min.index);
		System.out.println("최소시간: " + min.total);
		
		
		
	}

}
