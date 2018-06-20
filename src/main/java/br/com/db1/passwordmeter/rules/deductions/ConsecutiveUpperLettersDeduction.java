package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import br.com.db1.passwordmeter.rules.RegexUtil;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContains;
import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class ConsecutiveUpperLettersDeduction implements Meter {

    private static final String REGEX_CONSECUTIVE_UPPER = "[A-Z]{2,}";

    @Override
    public Integer calculate(String password) {
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_UPPER, password);
        return rates * 2;
    }
}
