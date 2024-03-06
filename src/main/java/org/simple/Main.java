package org.simple;

import java.text.MessageFormat;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            out.println("Please provide a position as a command-line argument.");
            return;
        }

        try {
            int position = Integer.parseInt(args[0]);
            var fizzBuzzOutput = FizzBuzz.fizzBuzz(position);
            out.println(
                    MessageFormat.format("Fizzbuzz output: ", fizzBuzzOutput)
            );
        } catch (NumberFormatException e) {
            out.println("Please provide a valid integer number.");
        }
    }
}