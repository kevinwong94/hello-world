import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Hello hello = new Hello();
		String result = hello.hello();
		assertEquals(result, "Hello");
		
	}
	
	@org.junit.jupiter.api.Test
	void test2() {
		Hello hello = new Hello();
		int result = hello.num();
		assertEquals(result, 0);
		
	}

}
