package module5;

public class Testcircle {

	public static void main(String[] args) {
	Circle circle =new Circle();
	Circle circle2 =new Circle();
	Circle circle3 =new Circle();
	circle.accept();
	circle.calarea();
	circle.calperi();
	circle.display();
System.out.println(circle.hashCode());
System.out.println(circle2.hashCode());
System.out.println(circle3.hashCode());
	
boolean result =circle.equals(circle2);
	System.out.println(result);
	
	}

}
