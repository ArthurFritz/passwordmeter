package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class LettersOnlyDeduction implements Meter {

    public static final Log log = LogFactory.getLog(LettersOnlyDeduction.class);

    @Override
    public Integer calculate(String password) {
        Integer result = countNotContains(REGEX_LETTERS, password) > 0 ? 0 : Math.negateExact(password.length());
        logResult(log,result);
        return result;
    }
}
