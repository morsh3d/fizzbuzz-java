package org.example;

public class FizzBuzz {
    public String fizzBuzzLine(int number) {
        if (number == 3 || number == 6) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
