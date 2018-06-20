package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;

public class ConsecutiveNumbersDeduction implements Meter {

    private static final String REGEX_CONSECUTIVE_NUMBER = "[0-9]{2,}";

    @Override
    public Integer calculate(String password) {
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_NUMBER, password);
        return Math.negateExact(rates * 2);
    }
}

