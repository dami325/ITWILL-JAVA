package javaExample;
import java.io.File;
import java.text.*;
import java.util.Scanner;

public class java549_MessageFormat {

	public static void main(String[] args) throws Exception {
//		String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
//		
//		Object[] arguments = {
//			"박주닮", "02-123-1234", "27", "07-09"	
//		};
//		
//		String result = MessageFormat.format(msg, arguments);
//		System.out.println(result);
		
//		String tableName = "CUST_INFO";
//		String msg = "INSERT INTO " + tableName + " VALUES (''{0}'',''{1}'',{2},''{3}'');";
//		
//		Object[][] arguments = {
//				{"박주닮","02-123-1234", "27", "07-09"},
//				{"김프로","032-333-1234", "33", "10-07"},
//		};
//		
//		for(int i =0; i < arguments.length; i++) {
//			String result = MessageFormat.format(msg, arguments[i]);
//			System.out.println(result);
//		}
		
		
//		String[] data = {
//				"INSERT INTO CUST_INFO VALUES ('박주담','02-123-1234',27,'07-09');",
//				"INSERT INTO CUST_INFO VALUES ('김다미','032-333-1234',33,'10-07');"
//		};
//		
//		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
//		MessageFormat mf = new MessageFormat(pattern);
//		
//		for(int i = 0; i < data.length; i++) {
//			Object[] objs = mf.parse(data[i]);
//			for(int j = 0; j < objs.length; j++) {
//				System.out.print(objs[j] + ",");
//			}
//			System.out.println();
//		}
		
		String tableName = "CUST_INFO";
		String fileName = "g:\\data4.txt";
		String msg = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});";
		Scanner s = new Scanner(new File(fileName));
		
		String pattern = "{0},{1},{2},{3}";
		MessageFormat mf = new MessageFormat(pattern);
		
		while(s.hasNextLine()) {
			String line = s.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		s.close();
		
		
	}

}
