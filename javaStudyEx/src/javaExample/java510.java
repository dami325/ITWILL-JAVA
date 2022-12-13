package javaExample;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class java510 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
//		int[] numarr = null;
//		int[] numarr2 = {1, 2, 3, 4};
//		numarr = numarr2;
//		
//		for(int i = 0; i < numarr.length; i ++) {
//			System.out.println(numarr[i]);
//		}
		
		
//		while(true) {
//			String prompt = ">>";
//			System.out.println(prompt);
//			
//			String input = s.nextLine();
//			
//			input = input.trim();
//			argArr = input.split(" +");
//			
//			String command = argArr[0].trim();
//			
//			if("".equals(command)) continue;
//			
//			command = command.toLowerCase();
//			
//			if(command.equals("q")) {
//				System.exit(0);
//			} else {
//				for(int i = 0; i < argArr.length; i++) {
//					System.out.println(argArr[i]);
//				}
//			}
//			
//		}
		
//		int sum = 0;
//		int cnt = 0;
//		
//		while (sc.hasNextInt()) {
//			sum += sc.nextInt();
//			cnt++;
//		}
//		
//		System.out.println("sum=" + sum);
//		System.out.println("average=" + (double)sum/cnt);
		
		Scanner sc = new Scanner(new File("C:\\temp\\data.txt"));
		int cnt = 0;
		int totalSum = 0;
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = " + sum);
			totalSum +=sum;
			cnt++;
			
		}
		System.out.println("Line: " + cnt + ", Total: " + totalSum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
