package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.*;

public class UpperLettersAddition extends LettersAddition implements Meter {

    public static final Log log = LogFactory.getLog(UpperLettersAddition.class);

    @Override
    public Integer calculate(String password) {
        Integer result = calculate(REGEX_UPPERCASE, password);
        logResult(log,result);
        return result;
    }
}
