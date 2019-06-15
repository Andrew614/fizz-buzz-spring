package wcci.fizzbuzzspring;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

	FizzBuzz underTest;

	@Before
	public void initalize() {
		underTest = new FizzBuzz();
	}

	@Test
	public void whenGiven1FizzBuzzSays1() {
		assertThatFizzBuzz(1, "1");
	}

	@Test
	public void whenGiven2FizzBuzzSays2() {
		assertThatFizzBuzz(2, "2");
	}

	@Test
	public void whenGiven3FizzBuzzSaysFizz() {
		assertThatFizzBuzz(3, "Fizz");
	}

	@Test
	public void whenGiven5FizzBuzzSaysBuzz() {
		assertThatFizzBuzz(5, "Buzz");
	}

	@Test
	public void whenGiven6FizzBuzzSaysFizz() {
		assertThatFizzBuzz(6, "Fizz");
	}

	@Test
	public void whenGiven9FizzBuzzSaysFizz() {
		assertThatFizzBuzz(9, "Fizz");
	}

	@Test
	public void whenGiven10FizzBuzzSaysBuzz() {
		assertThatFizzBuzz(10, "Buzz");
	}

	@Test
	public void whenGiven15FizzBuzzSaysFizzBuzz() {
		assertThatFizzBuzz(15, "FizzBuzz");
	}

	@Test
	public void whenGiven30FizzBuzzSaysFizzBuzz() {
		assertThatFizzBuzz(30, "FizzBuzz");
	}

	private void assertThatFizzBuzz(int num, String expected) {
		String spokenWord = underTest.say(num);
		assertThat(spokenWord, is(expected));
	}
}
