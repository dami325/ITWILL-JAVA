package javaExample;
import java.text.ChoiceFormat;

public class java548_ChoiceFormat {

	public static void main(String[] args) {
		
//		double[] limits = {60, 70, 80, 90}; //낮은 값부터 큰 값의 순서로 적어야한다.
//		// limits, grades간의 순서와 개수를 맞춰야 한다.
//		String[] grades = {"D", "C", "B", "A"};
//		
//		int[] scores = { 100, 95, 88, 70, 52, 60, 70};
//		
//		ChoiceFormat form = new ChoiceFormat(limits, grades);
//		
//		for(int i = 0; i < scores.length; i++) {
//			System.out.print(scores[i] + " : " + form.format(scores[i]) + " / ");
//		}
		
		String pattern = "60#D|70#C|80<B|90#A";
		int[] scores = { 91, 90, 80, 88, 70, 52, 60 };
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + ":" + form.format(scores[i]) + " / ");
		}
		
		
		
	}

}
