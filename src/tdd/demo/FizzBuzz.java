package tdd.demo;

public class FizzBuzz {
	public String convert(int src){
		
		if(src <= 0 || 101 <= src){
			return "Error";
		}	
		
		if(src % 15 == 0){
			return "FizzBuzz";
		}

		if(src % 3 == 0){
			return "Fizz";
		}

		if(src % 5 == 0){
			return "Buzz";
		}

		return String.valueOf(src);
	}
	

}
