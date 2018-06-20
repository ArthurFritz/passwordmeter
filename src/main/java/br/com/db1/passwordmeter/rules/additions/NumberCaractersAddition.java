package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;

public class NumberCaractersAddition implements Meter {

    @Override
    public Integer calculate(String password) {
        return password.length() * 4;
    }
}
