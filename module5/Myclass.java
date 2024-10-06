package module5;

class Myclass2 {

	public void fun2() {
		System.out.println("this is fun1");
	}
}

class Myclass1 {
	public void fun1() {
		System.out.println("this is fun 2");
	}
}

public class Myclass {

	public static void main(String[] args) {
		Myclass1 myclass1 = new Myclass1();
		myclass1.fun1();

		Myclass2 myclass2 = new Myclass2();
		myclass2.fun2();

	}

}
