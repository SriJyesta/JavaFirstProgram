package day2;

import day1.TestingJavaCode;

public class DataTypesVarDemo {

	public static void main(String[] args) 
	
	{
		// declaring var inside main method

		int value = 56;
		int code = 789;
		int s;
		s=2;
		double deci = 10.23;
		TestingJavaCode.test(value, code, s);
		TestingJavaCode.test1(deci);

		System.out.println(s);
		

	}

	public static void test(int value, int code, int s) {

		System.out.println(value+"  "+code+"   "+s);
		System.out.println(value);
		System.out.println(code);

	}

	public static void test1(double deci) {
		System.out.println(deci);

	}
}
