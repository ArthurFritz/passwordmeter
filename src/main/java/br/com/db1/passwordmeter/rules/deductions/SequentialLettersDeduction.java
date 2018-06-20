package br.com.db1.passwordmeter.rules.deductions;

public class SequentialLettersDeduction extends SequentialAbstractDeduction {

    @Override
    protected boolean rangeOnly(String lowerCase, int a) {
        return lowerCase.charAt(a) >= 'a' && lowerCase.charAt(a) <= 'z';
    }

}