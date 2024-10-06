package module5;

public class Functionoverloading {
	static public   int add(int a, int b) {
		return(a+b);
	}
	static public  int add(int a, int b,int c) {
		return(a+b+c);
	}
	static  public double add(int a, double b) {
		return(a+b);
	}
	
	
	
	public static void main(String[] args) {
		int result=add(10,20);
		System.out.println(result);
		int result1 = add(10,20,30);
		System.out.println(result1);
		double result2 = add(10,20.8);
		System.out.println(result2);

	}

}
