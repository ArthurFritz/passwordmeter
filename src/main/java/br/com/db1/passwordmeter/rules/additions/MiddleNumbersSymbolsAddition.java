package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class MiddleNumbersSymbolsAddition implements Meter {

    public static final Log log = LogFactory.getLog(MiddleNumbersSymbolsAddition.class);

    @Override
    public Integer calculate(String password) {
        if(password.length() > 2 ) {
            String middle = password.substring(1, password.length() - 1);
            Integer rates = countNotContains(REGEX_LETTERS, middle);
            Integer result = rates * 2;
            logResult(log,result);
            return result;
        }
        logResult(log,0);
        return 0;
    }
}
