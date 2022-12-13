package javaExample;
import java.util.Scanner;

public class java227_다차원배열_단어맞추기 {

	public static void main(String[] args) {
		//단어맞추기 - 영어 단어를 보여주고, 뜻을 맞추는 게임
		
		
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n",words[i][1]);
			}
		}
		
	}
}
