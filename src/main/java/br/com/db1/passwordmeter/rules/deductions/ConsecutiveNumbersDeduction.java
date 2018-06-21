package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;

public class ConsecutiveNumbersDeduction implements Meter {

    public static final Log log = LogFactory.getLog(ConsecutiveNumbersDeduction.class);
    private static final String REGEX_CONSECUTIVE_NUMBER = "[0-9]{2,}";

    @Override
    public Integer calculate(String password) {
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_NUMBER, password);
        Integer result = Math.negateExact(rates * 2);
        logResult(log,result);
        return result;
    }
}

