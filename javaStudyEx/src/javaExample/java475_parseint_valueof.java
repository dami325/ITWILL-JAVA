package javaExample;


public class java475_parseint_valueof {

	public static void main(String[] args) {
		int iVal = 100;
		double dVal = 200.0;
		String strival = String.valueOf(iVal); 
		String strdval = String.valueOf(dVal);
		
		double sum = Integer.parseInt("-"+strival) + Double.parseDouble(strdval);
		System.out.println(sum);
	}

}
