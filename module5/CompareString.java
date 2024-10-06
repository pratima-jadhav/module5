package module5;

public class CompareString {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		if(a==b)
			System.out.println("same");
		else 
			System.out.println(" not same");
		String str1="pratima";
		String str2="pratima";
		if(str1==str2) {
			System.out.println("same");
		}
			else
				System.out.println(" not same");	
			
			System.out.println("=========================");
			String str3= new String("priya");
			String str4= new String("priya");
			
			if(str3.equals(str4))
				System.out.println("same");
			else
				System.out.println(" not same");
			
			System.out.println("=========================");
			if(str3.equalsIgnoreCase(str4))
				System.out.println("same");
			else
				System.out.println(" not same");
		}
	}


