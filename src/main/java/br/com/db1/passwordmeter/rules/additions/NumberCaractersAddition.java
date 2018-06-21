package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NumberCaractersAddition implements Meter {

    public static final Log log = LogFactory.getLog(NumberCaractersAddition.class);

    @Override
    public Integer calculate(String password) {
        Integer result = password.length() * 4;
        logResult(log,result);
        return result;
    }
}
