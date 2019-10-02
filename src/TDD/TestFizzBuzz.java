package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFizzBuzz {
	FizzBuzz fizzbuzz = new FizzBuzz();
	int i = fizzbuzz.getInt(1);
	

	@Test
	void input_is_1_expect_output_is_1() {
		int input = 0;
		assertEquals(1, i);
	}

}
