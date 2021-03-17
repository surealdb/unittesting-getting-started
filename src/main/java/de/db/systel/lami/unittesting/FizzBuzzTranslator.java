package de.db.systel.lami.unittesting;

public class FizzBuzzTranslator {

    public String translate(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return "1";
    }

}
