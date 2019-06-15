package wcci.fizzbuzzspring;

import org.springframework.stereotype.Repository;

@Repository
public class FizzBuzz {
	
    public String say(Integer number) {
    	String result = "";
    	if(number % 3 == 0) {
    		result += "Fizz";
    	}
    	if(number % 5 == 0) {
    		result += "Buzz";
    	}
    	if(result.isEmpty()) {
    		result += String.valueOf(number);
    	}
    	
        return result;
        
    }
}
