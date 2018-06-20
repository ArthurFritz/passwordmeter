package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.*;

public class RequirementsAddition implements Meter {

    @Override
    public Integer calculate(String password) {
        Integer requirements = 0;
        requirements += countContains(REGEX_LOWER, password) > 0 ? 1 : 0;
        requirements += countContains(REGEX_UPPERCASE, password)> 0 ? 1 : 0;
        requirements += countContains(REGEX_NUMBER, password) > 0 ? 1 : 0;
        requirements += countNotContains(REGEX_LETTERS_NUMBERS, password) > 0 ? 1 : 0;
        requirements += password.length() >= 8 ? 1 : 0;
        return requirements;
    }
}
