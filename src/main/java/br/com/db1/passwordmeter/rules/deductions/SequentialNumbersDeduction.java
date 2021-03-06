package br.com.db1.passwordmeter.rules.deductions;

public class SequentialNumbersDeduction extends SequentialAbstractDeduction {

    @Override
    protected boolean rangeOnly(String lowerCase, Integer position) {
        return lowerCase.charAt(position) >= '0' && lowerCase.charAt(position) <= '9';
    }

}