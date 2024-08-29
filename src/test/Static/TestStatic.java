package Static;

class Student
{
	static int a = 10;
	static int b = 20;
	
	static int res;
		
	int x,y,z;
	
	static
	{
		System.out.println("Static Initialization block");
	}
	
	static void disp()
	{
		System.out.println("Static display method");
	
		res = a*b;
		System.out.println(res);		
		res = a+b;
		System.out.println(res);
	}
	
	{
		System.out.println("Java Initialization block");
	}
	
	Student() //Constructor1
	{
		System.out.println("Constructor - Zero parameterized");
	}
	
	Student(int a) //Constructor2
	{
		this.a = a;
		System.out.println("Constructor - single parameterized " + a);
	}
	
	public void display()
	{
		System.out.println("Display method of Student class");
	}
	
}
public class TestStatic 
{
//	static
//	{
//		System.out.println("Static block before main method");
//		TestStatic ts = new TestStatic();
//	}
//	
//
//	{
//		System.out.println("Java Initialization block before main method");
//	}
//
//	
//	TestStatic()
//	{
//		System.out.println("Constructor of main class - TestStatic");
//	}
	
	public static void main(String[] args) 
	{
		Student.disp();
		
		Student student = new Student();
		Student student1 = new Student(100);
//		student.disp(); // static display can also be called by object reference 
		student.display();
	
	}

	{
		System.out.println("Hello");
	}
	
}
