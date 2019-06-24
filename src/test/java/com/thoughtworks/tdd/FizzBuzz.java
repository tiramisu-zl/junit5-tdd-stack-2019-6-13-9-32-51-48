package com.thoughtworks.tdd;

public class FizzBuzz {
    public String call() {
        String str = "";
        for (int i = 0; i < 20; i++) {
            String result = fizzBuzz(i + 1);
            str += result;
        }
        System.out.println(str);
        return str;
    }

    private String fizzBuzz(int number) {
        String str = getSpecialWords(number);

        if (str == "") {
            str = String.valueOf(number);
        }

        return str+"\n";
    }

    private boolean isBaseNumber(int i, int i2) {
        return i % i2 == 0;
    }

    private String getSpecialWords(int number) {
        String str = "";
        if (isBaseNumber(number, 3)) {
            str += "Fizz";
        }
        if (isBaseNumber(number, 5)) {
            str += "Buzz";
        }
        if (isBaseNumber(number, 7)) {
            str += "Whizz";
        }

        return str;
    }

}
