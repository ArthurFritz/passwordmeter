package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_NUMBER;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class NumbersOnlyDeduction implements Meter {
    @Override
    public Integer calculate(String password) {
        return countNotContains(REGEX_NUMBER, password) > 0 ? 0 : Math.negateExact(password.length());
    }
}
