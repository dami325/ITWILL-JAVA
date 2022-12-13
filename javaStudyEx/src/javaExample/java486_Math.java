package javaExample;

import static java.lang.Math.*;
import static java.lang.System.*;
public class java486_Math {
	public static void main(String[] args) {
		int x1=1, y1=1;
		int x2=2, y2=2;
		
		double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
		System.out.println(c); // 1.4142135623730951 점과 점 거리

		double a = c * sin(PI/4);
		System.out.println(a);
		
		double b = c * cos(PI/4);
		System.out.println(b);
//		b = c * cosh(toRadians(45));
		System.out.println(atan2(a, b) * 180/PI); // atan2(a 값과 b 값으로 radian 값을 구함) 
												  //degree = (1radian = 약57.3 도 == 180/PI)
		System.out.println(toDegrees(atan2(a,b)));
		System.out.println(atan2(a, b)); // 0.7853981633974482 radian 좌표 0.0을 기준으로 (x , y)각도 == (a , b) 
		
		System.out.println(24*log10(10));
		
		System.out.println(Math.round(-3.4));
		
		int i = Integer.parseInt("90",16);
		System.out.println(i);
	}
}
