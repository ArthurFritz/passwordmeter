package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS_NUMBERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class SymbolsAddition implements Meter {

    @Override
    public Integer calculate(String password) {
        Integer rates = countNotContains(REGEX_LETTERS_NUMBERS, password);
        return rates * 6;
    }
}
