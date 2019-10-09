package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {	

	FizzBuzz call;
	
	@Test //1
	void input_is_1_expect_output_1() {
		String output = call.getint(1);
		assertEquals("1",output);
	}
	@Test //2
	void input_is_2_expect_output_2() {
		String output = call.getint(2);
		assertEquals("2",output);
	}

}
