package blog.valerioemanuele.fbkata;

import java.util.function.IntFunction;

public class FizzBuzz {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public static String convert(int i) {		
		return CONVERTER.apply(i);
	}

	private static final 
	IntFunction<String> CONVERTER = i -> {
			String res = "";
			if(isMultipleOf(i, 3))
				res = FIZZ;

			if(isMultipleOf(i, 5)) 
				res += BUZZ;
			
			return res.isEmpty() ? String.valueOf(i) : res;
		
	};

	private static boolean isMultipleOf(int n, int multiple) {
		return n % multiple == 0;
	}
}
