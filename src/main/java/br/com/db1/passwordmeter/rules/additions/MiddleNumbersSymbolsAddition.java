package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class MiddleNumbersSymbolsAddition implements Meter {
    @Override
    public Integer calculate(String password) {
        if(password.length() > 2 ) {
            String middle = password.substring(1, password.length() - 1);
            Integer rates = countNotContains(REGEX_LETTERS, middle);
            return rates * 2;
        }
        return 0;
    }
}
