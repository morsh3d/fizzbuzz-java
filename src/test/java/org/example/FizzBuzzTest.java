package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void shouldReturnTheFirstNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.fizzBuzzLine(1));
    }

    @Test
    void shouldReturnTheNextNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.fizzBuzzLine(2));
    }

    @Test
    void shouldReturnTheFirstFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.fizzBuzzLine(3));
    }

    @Test
    void shouldReturnTheFirstBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.fizzBuzzLine(5));
    }

    @Test
    void shouldReturnTheSecondBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.fizzBuzzLine(10));
    }

    @Test
    void shouldReturnTheSecondFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.fizzBuzzLine(6));
    }

    @Test
    void shouldReturnFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzzLine(15));
    }

    /*
    I want to return Fizz for number 3
    And then return Buzz for number 5
    I want to return Fizz for number 6
    Return the first FizzBuzz for number 15
     */

}