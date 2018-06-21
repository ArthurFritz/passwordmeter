package br.com.db1.passwordmeter.rules.deductions;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS_NUMBERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class SequentialSymbolsDeduction extends SequentialAbstractDeduction {

    @Override
    protected boolean rangeOnly(String lowerCase, Integer position) {
    	char character = lowerCase.charAt(position);
        return countNotContains(REGEX_LETTERS_NUMBERS, String.valueOf(character)) > 0;
    }

}