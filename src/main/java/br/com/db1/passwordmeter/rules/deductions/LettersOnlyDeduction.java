package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class LettersOnlyDeduction implements Meter {

    @Override
    public Integer calculate(String password) {
        return countNotContains(REGEX_LETTERS, password) > 0 ? 0 : password.length();
    }
}
