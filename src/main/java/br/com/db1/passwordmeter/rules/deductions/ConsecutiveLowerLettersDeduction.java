package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;

public class ConsecutiveLowerLettersDeduction implements Meter {

    private static final String REGEX_CONSECUTIVE_LOWER = "[a-z]{2,}";

    @Override
    public Integer calculate(String password) {
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_LOWER, password);
        return rates * 2;
    }
}
