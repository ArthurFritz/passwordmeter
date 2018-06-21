package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import br.com.db1.passwordmeter.rules.RegexUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.countContainsConsecutive;

public class ConsecutiveLowerLettersDeduction implements Meter {

    public static final Log log = LogFactory.getLog(ConsecutiveLowerLettersDeduction.class);
    private static final String REGEX_CONSECUTIVE_LOWER = "[a-z]{2,}";

    @Override
    public Integer calculate(String password) {
    	String cleanPass = RegexUtil.clearEmpty(password);
        Integer rates = countContainsConsecutive(REGEX_CONSECUTIVE_LOWER, cleanPass);
        Integer result = Math.negateExact(rates * 2);
        logResult(log,result);
        return result;
    }
}
