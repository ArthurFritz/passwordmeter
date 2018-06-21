package br.com.db1.passwordmeter.rules.additions;

import br.com.db1.passwordmeter.rules.Meter;
import br.com.db1.passwordmeter.rules.RegexUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import static br.com.db1.passwordmeter.rules.RegexUtil.REGEX_LETTERS_NUMBERS;
import static br.com.db1.passwordmeter.rules.RegexUtil.countNotContains;

public class SymbolsAddition implements Meter {

    public static final Log log = LogFactory.getLog(SymbolsAddition.class);

    @Override
    public Integer calculate(String password) {
    	String cleanPass = RegexUtil.clearEmpty(password);
        Integer rates = countNotContains(REGEX_LETTERS_NUMBERS, cleanPass);
        Integer result = rates * 6;
        logResult(log,result);
        return result;
    }
}
