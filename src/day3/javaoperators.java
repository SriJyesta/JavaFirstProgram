package day3;

public class javaoperators {

	public static void main(String[] args) {
		// Java Operators
		
//		Arithmetic operators
		int a=10, b=20;
		System.out.println(a+b);
		System.out.println(a/b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
//		Relational operators returns boolean data type true or false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
//		logical operators
		boolean s= true, t=false;
		boolean q= s&&t;
		boolean w= s||t;
		boolean e= !t;
		boolean r= !s;
		System.out.println(q +" " + w +" " + e +" "+r);
//		Increment and Decrement
		System.out.println("Increment and Decrement");
//		int x=5;
//		int c=++x;
//		System.out.println(c);
		
//		int x1 = 5;
//		int z =x1++;
//		int y =++x1; // x is 6 and y is 6
//		System.out.println(z);
//
//		System.out.println(y);
		
		
		int x2 = 5;
		int z1 =x2--;
		int y1 =--x2; 
		System.out.println(z1);
//		System.out.println(y1);
		
//		Assignment operators
		System.out.println("Assignment operators");
		int p=10;
		p&=20;
		System.out.println(p);
		
//		ternary operators
		System.out.println("ternary  operators");
		int p2=10, p3=20;
		int x4=p2>p3 ? p2:p3;
		System.out.println(x4);
		
//		Swapping numbers
		int y = 10;
		int u = 20;
		System.out.println("Swapping numbers");
		y+=10;
		System.out.println(y);
		u-=10;
		System.out.println(u);
		
		
		
		

		
		
		
		

	}
	
	

}
