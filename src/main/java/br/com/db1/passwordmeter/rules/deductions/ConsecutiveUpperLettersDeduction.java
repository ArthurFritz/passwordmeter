package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import br.com.db1.passwordmeter.rules.RegexUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContains;
import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class ConsecutiveUpperLettersDeduction implements Meter {

    public static final Log log = LogFactory.getLog(ConsecutiveUpperLettersDeduction.class);
    private static final String REGEX_CONSECUTIVE_UPPER = "[A-Z]{2,}";

    @Override
    public Integer calculate(String password) {
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_UPPER, password);
        Integer result = Math.negateExact(rates * 2);
        logResult(log,result);
        return result;
    }
}
