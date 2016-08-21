package com.dsyang.cli;

import com.dsyang.calculator.Calculator;
import com.dsyang.logger.DefaultLogger;
import com.dsyang.logger.Logger;
import com.dsyang.utils.Utils;

public class Main {

    public static void main (String[] args) {
        Logger logger = new DefaultLogger();
        if (args.length != 3) {
            logger.log(
                String.format(
                    "arg length incorrect. Expected 3 got %d. List: %s",
                    args.length,
                    Utils.join(args, "|")));
            return;
        }
        String number1 = args[0];
        String op = args[1];
        String number2 = args[2];

        logger.log(Calculator.calculate(number1, op, number2));
    }
}
