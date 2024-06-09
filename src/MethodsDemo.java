
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);

		String name2 = getData2();
		System.out.println(name2);

		// method from diff java class
		MethodsDemo2 e = new MethodsDemo2();

		String names = e.getUserData();
		System.out.println(names);

	}

	public String getData() {
		System.out.println("Hello World");
		return "hi";
	}

	// static
	public static String getData2() {
		System.out.println("Hello World1");
		return "hi1";
	}

}
