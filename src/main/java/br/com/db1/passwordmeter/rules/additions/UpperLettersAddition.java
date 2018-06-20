package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_UPPERCASE;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class UpperLettersAddition implements Meter {

    @Override
    public Integer calculate(String password) {
        Integer rates = countNotContains(REGEX_UPPERCASE, password);
        return rates * 2;
    }
}
