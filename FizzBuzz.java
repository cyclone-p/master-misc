class FizzBuzz {
	
	public static void main (String args[]) {
		
		String fizz = "Fizz";
		String buzz = "Buzz";
		
		for (int i = 0; i <= 100; i++) {

			StringBuffer output = new StringBuffer();

			if (i % 3 == 0)
				output = output.append(fizz);
			if (i % 5 == 0)
				output = output.append(buzz);
			if (!(i % 3 == 0) && !(i % 5 ==0))
				output = output.append(i);

			System.out.println("Output : " + output);
		}
	}
}