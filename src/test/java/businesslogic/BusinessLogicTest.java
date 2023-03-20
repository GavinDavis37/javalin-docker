package businesslogic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import businesslogic.ExampleClass;
class BusinessLogicTest {

	@Test
	void exampleTest() {
		ExampleClass logic = new ExampleClass();
		logic.addN(5);
		assertEquals(5, logic.getCallCount());
		logic.function();
		assertEquals(6, logic.getCallCount());
	}
}
