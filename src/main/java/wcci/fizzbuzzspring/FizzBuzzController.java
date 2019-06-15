package wcci.fizzbuzzspring;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {

	@Resource
	FizzBuzz fizzBuzz;
	ArrayList<String> fizzBuzzGuesses = new ArrayList<String>();
	int counter = 0;
	
	@RequestMapping("/")
	@ResponseBody
	public String playFizzBuzz() {
		if(fizzBuzzGuesses.isEmpty()) {			
			populateWithGuesses();
		}
		String guess = retrieveGuess();
		counter++;
		return guess;
	}

	private String retrieveGuess() {
		return fizzBuzzGuesses.get(counter%fizzBuzzGuesses.size());
	}

	private void populateWithGuesses() {
		fizzBuzzGuesses.add(fizzBuzz.say(1));
		fizzBuzzGuesses.add(fizzBuzz.say(2));
		fizzBuzzGuesses.add(fizzBuzz.say(3));
		fizzBuzzGuesses.add(fizzBuzz.say(5));
		fizzBuzzGuesses.add(fizzBuzz.say(9));
		fizzBuzzGuesses.add(fizzBuzz.say(10));
		fizzBuzzGuesses.add(fizzBuzz.say(15));
		fizzBuzzGuesses.add(fizzBuzz.say(30));
	}
}
