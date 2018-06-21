package br.com.db1.passwordmeter.rules.deductions;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.db1.passwordmeter.rules.Meter;
import br.com.db1.passwordmeter.rules.RegexUtil;

public class ConsecutiveUpperLettersDeduction implements Meter {

    public static final Log log = LogFactory.getLog(ConsecutiveUpperLettersDeduction.class);
    private static final String REGEX_CONSECUTIVE_UPPER = "[A-Z]{2,}";

    @Override
    public Integer calculate(String password) {
    	String cleanPass = RegexUtil.clearEmpty(password);
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_UPPER, cleanPass);
        Integer result = Math.negateExact(rates * 2);
        logResult(log,result);
        return result;
    }
}
