package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LOWER;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class LowerLettersAddition implements Meter {
    @Override
    public Integer calculate(String password) {
        Integer rates = countNotContains(REGEX_LOWER, password);
        return rates * 2;
    }
}
