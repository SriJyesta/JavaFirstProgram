package day1;

public class TestingJavaCode {
	
	public static int a;
	public static String b;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 1;
		int code = 789;
		int s = 89;
		
		double deci=10.23;
		TestingJavaCode.test(value, code, s);
		TestingJavaCode.test1(deci);

	}

	public static void test(int value, int code, int s) {

		System.out.println(value+"  "+code+"   "+s);
		System.out.println(value);
		System.out.println(code);

	}

	public static void test1(double deci) {
		System.out.println(deci);
		TestingJavaCode.a=345;
		TestingJavaCode.b="Jyesta";
		System.out.println(a);
		System.out.println(b);
		
		
		

	}
}
