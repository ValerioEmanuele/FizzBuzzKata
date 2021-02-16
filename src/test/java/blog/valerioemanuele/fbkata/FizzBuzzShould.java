package blog.valerioemanuele.fbkata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FizzBuzzShould {


	@Test
	public void convert_1_to_1() {
		String result = FizzBuzz.convert(1);
		assertThat(result).isEqualTo("1");
	}
	
	
	@Test
	public void convert_2_to_2() {
		String result = FizzBuzz.convert(2);
		assertThat(result).isEqualTo("2");
	}
	
	@Test
	public void convert_3_to_Fizz() {
		String result = FizzBuzz.convert(3);
		assertThat(result).isEqualTo("Fizz");
	}
	
	@Test
	public void convert_6_to_Fizz() {
		String result = FizzBuzz.convert(6);
		assertThat(result).isEqualTo("Fizz");
	}
	
	@Test
	public void convert_4_to_4() {
		String result = FizzBuzz.convert(4);
		assertThat(result).isEqualTo("4");
	}
	
	@Test
	public void convert_5_to_Buzz() {
		String result = FizzBuzz.convert(5);
		assertThat(result).isEqualTo("Buzz");
	}
	
	@Test
	public void convert_10_to_Buzz() {
		String result = FizzBuzz.convert(10);
		assertThat(result).isEqualTo("Buzz");
	}
	
	@Test
	public void convert_15_to_FizzBuzz() {
		String result = FizzBuzz.convert(15);
		assertThat(result).isEqualTo("FizzBuzz");
	}

}
