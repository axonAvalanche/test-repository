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
            long fibonacciNumber = Fibonacci.calculate(position);
            out.println(
                    MessageFormat.format("Fibonacci number at position {0} is: {1}", position, fibonacciNumber)
            );
        } catch (NumberFormatException e) {
            out.println("Please provide a valid integer number.");
        }
    }
}