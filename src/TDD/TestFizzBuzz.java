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
	@Test //3
	void input_is_3_expect_output_Fizz() {
		String output = call.getint(3);
		assertEquals("Fizz",output);
		}
	@Test //4
	void input_is_4_expect_output_4() {
		String output = call.getint(4);
		assertEquals("4",output);
	}
	@Test //5
	void input_is_5_expect_output_Buzz() {
		String output = call.getint(5);
		assertEquals("Buzz",output);
	}
	@Test //6
	void input_is_6_expect_output_Fizz() {
		String output = call.getint(6);
		assertEquals("Fizz",output);
		}
	@Test //7
	void input_is_7_expect_output_7() {
		String output = call.getint(7);
		assertEquals("7",output);
	}
	@Test //8
	void input_is_8_expect_output_8() {
		String output = call.getint(8);
		assertEquals("8",output);
	}
	@Test //9
	void input_is_9_expect_output_Fizz() {
		String output = call.getint(9);
		assertEquals("Fizz",output);
		}
	@Test //10
	void input_is_10_expect_output_Buzz() {
		String output = call.getint(10);
		assertEquals("Buzz",output);
	}
	@Test //11
	void input_is_11_expect_output_11() {
		String output = call.getint(11);
		assertEquals("11",output);
	}
	@Test //12
	void input_is_12_expect_output_Fizz() {
		String output = call.getint(12);
		assertEquals("Fizz",output);
		}
	@Test //13
	void input_is_13_expect_output_13() {
		String output = call.getint(13);
		assertEquals("13",output);
	}
	@Test //14
	void input_is_14_expect_output_14() {
		String output = call.getint(14);
		assertEquals("14",output);
	}

}
