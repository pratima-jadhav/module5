package module5;

public class UpwardCasting {

	public static void main(String[] args) { 
		int a=100;
		double d=a;				//upward casting:auto
		System.out.println(d);
		 double d1=66.99;
		 int i=(int)d1;			//downward casting:explicit
		 System.out.println(i);

	}

}
