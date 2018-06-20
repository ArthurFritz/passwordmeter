package br.com.db1.passwordmeter.rules.deductions;

public class SequentialSymbolsDeduction extends SequentialAbstractDeduction {

    @Override
    protected boolean rangeOnly(String lowerCase, int a) {
        return (lowerCase.charAt(a) <= '0' || lowerCase.charAt(a) >= '9') && (lowerCase.charAt(a) <= 'a' || lowerCase.charAt(a) >= 'z');
    }

}