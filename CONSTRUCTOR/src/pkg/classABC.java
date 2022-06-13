package pkg;

public class classABC
{
	 public classABC() 
	 {
		System.out.println("default constructor");// TODO Auto-generated constructor stub
	}
	 public classABC(int a , int b) 
	 {
		System.out.println("two parameterized constructor");// TODO Auto-generated constructor stub
	}
	 public classABC(int a) 
	 {
	
		 System.out.println("one 1 parameterized constructor");// TODO Auto-generated constructor stub
	}
	 public static void main(String[] args)
	 {
		classABC obj=new classABC(34,12);
		classABC obj2=new classABC();
		classABC obj3=new classABC(22);
		
	}
}
