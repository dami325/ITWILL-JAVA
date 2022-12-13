package quest;

public class kakao {
	

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		Solution s = new Solution();
		System.out.println(s.solution(numbers, hand));	
	}

}


class Solution {

    public String solution(int[] numbers, String hand) {
    	String answer = "";
    	int[][] phone = {{ 1, 2, 3 }, 
					     { 4, 5, 6 }, 
					     { 7, 8, 9 }, 
					     {'*',0,'#'}};
		// 왼손 좌표 (행, 열)		// 오른손 좌표 (행, 열)
		int x1 = 3, y1 = 0,		x = 3, y = 2;
		int left = '*' , 		right= '#';			 // 손 위치
		
		
		OUTER:
    	for(int i = 0; i < numbers.length; i ++) {				 // 입력받은 번호만큼 반복
    		for(int j = 0; j < phone.length; j ++) {
    			for(int k = 0; k < phone[j].length; k ++) {
    				if(numbers[i] == phone[j][k]) {				 // 입력받은 번호와 핸드폰번호가 일치할때
	    				if(k == 0) { 							 // 1열( 왼손 )   번호일때(1, 4, 7)
	    					x1 = j;
	    					y1 = k;
	    					left = numbers[i];
	    					answer += "L";
	    				}
	    				if(k == 2) { 							  // 3열( 오른손 ) 번호일때(3, 6, 9)
	    					x = j;
	    					y = k;
	    					right = numbers[i];
	    					answer += "R";
	    				}
	    				if(k == 1) { 							  // 2열( 가운데 ) 번호일때 (2, 5, 8, 0)
	    					if(right == phone[j][k]) {
	    						x = j;
	    						y = k;
	    						right = numbers[i];
	    						answer += "R";
	    						continue OUTER;
	    					}
	    					if(left == phone[j][k]) {
	    						x1 = j;
	    						y1 = k;
	    						left = numbers[i];
	    						answer += "L";
	    						continue OUTER;
	    					}
	    					//입력받은 번호 좌표와 오른손 현재위치 좌표 거리 비교
	    					double rDistance =getDistance(j, k, x, y); 
	    					//입력받은 번호 좌표와 왼손 현재위치 좌표 거리 비교
	    					double lDistance =getDistance(j, k, x1, y1);
	    					if(rDistance < lDistance) { 					// 오른손거리가 짧을때
	    						right = numbers[i];
	    						answer += "R";
	    						x = j;
	        					y = k;
	    					} else if(lDistance < rDistance){ 				// 왼손거리가 짧을때
	    						left = numbers[i];
	    						answer += "L";
	    						x1 = j;
	        					y1 = k;
	    					} else if(rDistance == lDistance) { 			// 거리가 같을때
	    						if(hand.equals("right")) {					// 오른손잡이 일때
	    							answer += "R";
	    							x = j;
	    	    					y = k;
		    						right = numbers[i];
	    						}else {										// 왼손잡이 일때
	    							answer += "L";
	    							x1 = j;
	    	    					y1 = k;
		    						left = numbers[i];
	    						}
	    					}
	    					continue OUTER;
	    				}
	    				continue OUTER;
    				}
    			}
    		}
        }
        return answer;
    }
    
	static double getDistance(int x, int y, int x1, int y1) { 				// 좌표거리구하는 메서드
		return (double)Math.sqrt( Math.pow((y1-y), 2) + Math.pow((x1-x), 2));
	}
}



