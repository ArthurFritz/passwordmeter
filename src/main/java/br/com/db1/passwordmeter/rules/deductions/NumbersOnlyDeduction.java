package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import br.com.db1.passwordmeter.rules.RegexUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_NUMBER;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class NumbersOnlyDeduction implements Meter {

    public static final Log log = LogFactory.getLog(NumbersOnlyDeduction.class);

    @Override
    public Integer calculate(String password) {
    	String cleanPass = RegexUtil.clearEmpty(password);
        Integer result = countNotContains(REGEX_NUMBER, cleanPass) > 0 ? 0 : Math.negateExact(password.length());
        logResult(log,result);
        return result;
    }
}
