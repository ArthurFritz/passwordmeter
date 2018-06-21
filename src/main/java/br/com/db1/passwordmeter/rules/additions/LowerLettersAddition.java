package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LOWER;
import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_UPPERCASE;
import static br.com.db1.passwordmeter.rules.RegexUtil.countContains;

public class LowerLettersAddition extends LettersAddition implements Meter {

    public static final Log log = LogFactory.getLog(LowerLettersAddition.class);

    @Override
    public Integer calculate(String password) {
        Integer result = calculate(REGEX_LOWER, password);
        logResult(log,result);
        return result;
    }
}
