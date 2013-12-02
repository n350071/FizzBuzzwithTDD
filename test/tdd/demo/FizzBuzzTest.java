package tdd.demo;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

import tdd.demo.FizzBuzz;

public class FizzBuzzTest {
	
	FizzBuzz sut;
	static final String FIZZ = "Fizz";
	static final String BUZZ = "Buzz";
	static final String FIZZBUZZ = "FizzBuzz";
	static final String ERROR = "Error";
	
	@Before
	public void setUp(){
		sut = new FizzBuzz();
	}

	@Test
	public void _1to1() {
		//system under test
		assertThat(sut.convert(1),is("1"));		
	}

	@Test
	public void _2to2() {
		//system under test
		assertThat(sut.convert(2),is("2"));		
	}
	
	@Test
	public void _3timesFizz() {
		//system under test
		assertThat(sut.convert(3),is(FIZZ));		
	}

	@Test
	public void _6timesFizz() {
		//system under test
		assertThat(sut.convert(6),is(FIZZ));		
	}

	@Test
	public void _5timesBuzz() {
		//system under test
		assertThat(sut.convert(5),is(BUZZ));		
	}

	@Test
	public void _10timesBuzz() {
		//system under test
		assertThat(sut.convert(10),is(BUZZ));		
	}

	@Test
	public void _15timesFizzBuzz() {
		//system under test
		assertThat(sut.convert(15),is(FIZZBUZZ));		
	}

	@Test
	public void _30timesFizzBuzz() {
		//system under test
		assertThat(sut.convert(30),is(FIZZBUZZ));		
	}

	@Test
	public void _0toerror() {
		//system under test
		assertThat(sut.convert(0),is(ERROR));		
	}

	@Test
	public void _101toerror() {
		//system under test
		assertThat(sut.convert(101),is(ERROR));		
	}

	@Test
	public void _102toerror() {
		//system under test
		assertThat(sut.convert(102),is(ERROR));		
	}

	@Test
	public void _minus1toerror() {
		//system under test
		assertThat(sut.convert(-1),is(ERROR));		
	}

	@Test
	public void _minus2toerror() {
		//system under test
		assertThat(sut.convert(-2),is(ERROR));		
	}

	
}
