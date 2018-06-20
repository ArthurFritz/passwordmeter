package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

public class SequentialNumbersDeduction extends SequentialAbstractDeduction {

    @Override
    protected boolean rangeOnly(String lowerCase, int a) {
        return lowerCase.charAt(a) >= '0' && lowerCase.charAt(a) <= '9';
    }

}