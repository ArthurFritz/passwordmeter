package br.com.db1.passwordmeter.rules.additions;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContains;

public class LettersAddition  {

    protected Integer calculate(String regex, String password) {
        Integer ratesLower = countContains(regex, password);
        Integer rates = ratesLower > 0 ? (password.length() - ratesLower) : 0;
        return rates * 2;
    }
}
