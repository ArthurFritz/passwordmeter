package br.com.db1.passwordmeter.rules.additions;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LOWER;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.db1.passwordmeter.rules.Meter;

public class LowerLettersAddition extends LettersAddition implements Meter {

    public static final Log log = LogFactory.getLog(LowerLettersAddition.class);

    @Override
    public Integer calculate(String password) {
        Integer result = calculate(REGEX_LOWER, password);
        logResult(log,result);
        return result;
    }
}
