package test_GitHub;

public class Math_Operations {
	public static void main(String[] args) {
		System.out.println("Execution in Main Method");
		add();
		subs(50, 10);
		Math_Operations M1=new Math_Operations();
		M1.mult(02, 70);
		M1.div();
	}
	
	public static void add() { //Static Regular Method in Same Class without Parameters.
	    int a=20;
		int b=10;
		int c=a+b;
		System.out.println("Addition of given two numbers is = "+ c);
	}
	
	public static void subs(int a, int b){ //Static Regular Method in Same Class with Parameters.
	    int c=a-b;
		System.out.println("Subtraction of given two numbers is = "+ c);
	}
	
	public void div(){//Non-Static Regular Method in Same Class without Parameters.
		int a=4;
		int b=7;
		int c=a/b;
		System.out.println("Division of given two numbers is = "+ c);
	}
	public void mult(int a, int b)//Non-Static Regular Method in Same Class with Parameters.
	{
		int c=a*b;
		System.out.println("Multiplication of given two numbers is = "+ c);
	}

	
	
	
	
	/*public class Sample3 {
	public static void main(String[] args) 
	{
		System.out.println("Running main method");
		addition();//calling static method from same class
		Sample3 s3=  new Sample3();// creating object of class
		s3.sub();// calling non static method from same class
		s3.mul(10, 9);// calling non-static methods with parameters
		s3.mul(20, 3);
		
		Sample3 t3= new Sample3();// creating another object in same class-->dont create multiple object if not necessary. 
		t3.mul(59, 10);// calling mul using new object t3
		
		mul(10, 20, 8);// calling static method with 3 parameters.
		mul(11,12,13);
	
	}

	public static void addition()  // creating static method without parameter
	{
		int a=10;// 1.2 variable initialization and declaration
		int b=20;
		int sum=a+b;
		System.out.println("Addition of two numbers is "+sum);
		
	}
	
	public void sub() // creating non-static method without parameter
	{
		int a=10;
		int b=30;
		int subs=b-a;
		System.out.println("Substration of two numbers is "+subs);
	}
	
	public void mul(int a, int b)// non-static with parameters//10, 7
	{
		int multiplication=a*b;
		System.out.println("Multiplication of two numbers is "+multiplication);
	}
	
	public static void mul(int a, int b, int c)// static with parameters//10, 7
	{
		int multiplication=a*b*c;
		System.out.println("Multiplication of two numbers is "+multiplication);
	}
	
	
}
		 */

	}
