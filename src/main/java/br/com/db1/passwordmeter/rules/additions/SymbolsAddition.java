package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS_NUMBERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class SymbolsAddition implements Meter {

    public static final Log log = LogFactory.getLog(SymbolsAddition.class);

    @Override
    public Integer calculate(String password) {
        Integer rates = countNotContains(REGEX_LETTERS_NUMBERS, password);
        Integer result = rates * 6;
        logResult(log,result);
        return result;
    }
}
