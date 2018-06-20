package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_NUMBER;
import static br.com.db1.passwordmeter.rules.RegexUtil.countContains;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class NumberAddition  implements Meter {

    @Override
    public Integer calculate(String password) {
        return countNotContains(REGEX_NUMBER, password) > 0 ? countContains(REGEX_NUMBER, password) * 6 : 0;
    }
}