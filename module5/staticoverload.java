package module5;

public class staticoverload {

	 static public void main() {
		System.out.println("main method without parameter");
	}

	 static public void main(int a, int b) {
		System.out.println("main method with 2 parameter");
	}

	 static public void main(int a) {
		System.out.println("main method with 1 parameter");
	}

	public static void main(String[] args) {
		overloadmain obj = new overloadmain();
	main();
	main(10);
	main(10,20);


}
}

