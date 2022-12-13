package for_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 1			i=1 일때	j = 1 ~ 1
		 * 1 2			i=2 일때 j = 1 ~ 2
		 * 1 2 3		i=3 일때 j = 1 ~ 3
		 * 1 2 3 4		i=4 일때 j = 1 ~ 4
		 * 1 2 3 4 5	i=5 일때 j = 1 ~ 5
		 * */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(j + " ");
				
			}
			System.out.println();
			
		}
		
		System.out.println("======================");
		
		/*
		 *		*****	i = 5일때 j = 1 ~ 5
		 * 		****	i = 4일때 j = 1 ~ 4
		 * 		***		i = 3일때 j = 1 ~ 3
		 * 		**		i = 2일때 j = 1 ~ 2
		 * 		*		i = 1일때 j = 1 ~ 1
		 * */
		
		for(int i = 5; i >= 1; i--) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("=============================");
		
		/*
		 * 			*  i=1일때 공백:4 별:1
		 * 		   **  i=2일때 공백:3 별:2	
		 * 		  ***  i=3일때 공백:2 별:3	
		 * 		 ****  i=4일때 공백:1 별:4
		 * 		*****  i=5일때 공백:0 별:5
		 * */
		
//		int line = 7;	// 줄수
//		int space = line - 1;	// 공백수
//		int star = 1;	// 별수
//		
//		for(int i = 0; i < line; i++) {
//			
//			// 공백찍기
//			for(int j = 0; j < space; j++) {
//				System.out.print(" ");
//			}
//			
//			// 별찍기
//			for(int j = 0; j < star; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//			star++;
//			space--;
//			
//		}
		
		System.out.println("========================");
		
		/*
		 * 		*****
		 * 		 ****
		 * 		  ***
		 * 		   **
		 * 		    *
		 * 
		 * */
		
		int line = 20;
		int star = line;
		int space = 0;
		
		for(int i = 0; i < line; i++) {	// 줄 수
			
			for(int j = 0; j < space; j++) {	// 공백
				System.out.print(" ");
			}
			
			for(int j = 0; j < star; j++) {	// 별
				System.out.print("*");
			}
			
			System.out.println();
			
			star--;
			space++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
