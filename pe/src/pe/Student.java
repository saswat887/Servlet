package pe;

public class Student {
	int a=50;
	int b=100;
	{
		System.out.println("Hello");
	}
	static {
		System.out.println("hi");
	}
	public static Student m1(Student s)
	{
		s.a=500;
		s.b=300;
		return new Student();
		
	}
	public static void main(String[] args) {
		System.out.println("Morning");
		Student s=new Student();
		s.a=200;
		s.b=250;
		System.out.println(s.a);
		Student m=m1(s);
		System.out.println(s.a);
		System.out.println(m.a);
		
		
	}
}
