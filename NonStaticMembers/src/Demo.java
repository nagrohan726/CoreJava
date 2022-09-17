
public class Demo {

	static Demo obj = new Demo();

	static {
		System.out.println(Demo.obj);

		// Demo.init();
		Demo.obj = Demo.init();
	}

	public static void main(String[] args) {
		System.out.println(Demo.obj);
	}

//	static void init() {
//		Demo.obj = new Demo();
//	}

	static Demo init() {
		return new Demo();
	}
}
