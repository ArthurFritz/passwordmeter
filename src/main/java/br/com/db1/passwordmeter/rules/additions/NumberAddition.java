package br.com.db1.passwordmeter.rules.additions;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_NUMBER;
import static br.com.db1.passwordmeter.rules.RegexUtil.countContains;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.db1.passwordmeter.rules.Meter;

public class NumberAddition  implements Meter {

    public static final Log log = LogFactory.getLog(NumberAddition.class);

    @Override
    public Integer calculate(String password) {
        Integer result = countNotContains(REGEX_NUMBER, password) > 0 ? countContains(REGEX_NUMBER, password) * 4 : 0;
        logResult(log,result);
        return result;
    }
}