package quest;
import java.util.Scanner;

public class hotel {
	public static void main(String[] args) {
		/*손님은 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않음 
		 * 다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호 
		 * 예를 들면 102 호 방보다는 301 호 방을 더 선호 
		 * 102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문
		 * 같은 이유로 102 호보다 2101 호를 더 선호
		 * 초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 코드
		 * 첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 
		*/
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 	//반복문 횟수
		int H = 0;				//호텔의 층 수
		int W = 0;				//각 층의 방 수
		int N = 0;				//몇번째 손님
		int count = 0;
		int[][] hotel;
		
		for(int t = 0; t < T; t++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			hotel = new int [H][W];
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					hotel[i][j] = 101 + 100*i + j;
					System.out.print(hotel[i][j] + " ");
				}
				System.out.println();
			}
			
			for(int i = 0; i < W; i++) {
				for(int j = 0; j < H; j++) {
					count++;
					if(count == N) {
						System.out.println(hotel[j][i]);
						break;
					}
				}
			}
			count = 0;
		}
			
		
		
		
	}

}
