package br.com.db1.passwordmeter.rules.deductions;

public class SequentialLettersDeduction extends SequentialAbstractDeduction {

    @Override
    protected boolean rangeOnly(String lowerCase, Integer position) {
        return lowerCase.charAt(position) >= 'a' && lowerCase.charAt(position) <= 'z';
    }

}