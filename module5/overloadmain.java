package module5;

public class overloadmain {
	public void main() {
		System.out.println("main method without parameter");
	}

	public void main(int a, int b) {
		System.out.println("main method with 2 parameter");
	}

	public void main(int a) {
		System.out.println("main method with 1 parameter");
	}

	public static void main(String[] args) {
		overloadmain obj = new overloadmain();
		obj.main();			//1
		obj.main(10);		//3
		obj.main(10, 20);	//2
	}

}
