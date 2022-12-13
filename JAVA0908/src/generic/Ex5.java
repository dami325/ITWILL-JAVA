package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		String str = "MissIssipi";
		char[] chs = str.toUpperCase().toCharArray();
		List<Character> list = new ArrayList<Character>();
		for(char ch : chs) {
			list.add(ch);
		}
		
		System.out.println(list);
		LinkedHashSet<Character> set  = new LinkedHashSet<Character>(list);
		ArrayList<Character> targets = new ArrayList<Character>(set);
		int[] count = new int[targets.size()];
		
		int i = 0;
		for(char target : targets) {
			for(char ch : chs) {
				if(target == ch) {
					count[i]++;
				}
			}
			i++;
		}
		
		System.out.println(targets);
		System.out.println(Arrays.toString(count));
		
		
	}

}
