package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RepeatCharactersDeduction implements Meter {

    public static final Log log = LogFactory.getLog(RepeatCharactersDeduction.class);

    @Override
    public Integer calculate(String password) {
        String passwordValidate = password.replaceAll(" ","");
        Double repeat = 0.0;
        Long qtdRepeat = 0l;
        Double length = Double.valueOf(passwordValidate.length());
        for (int firstLoop=0; firstLoop < length; firstLoop++) {
            boolean existChar = false;
            for (int secondLoop=0; secondLoop < length; secondLoop++) {
                if (passwordValidate.charAt(firstLoop) == passwordValidate.charAt(secondLoop) && firstLoop != secondLoop) {
                    existChar = true;
                    repeat += Math.abs(length/(secondLoop-firstLoop));
                }
            }
            if (existChar) {
                qtdRepeat ++;
                Double unique = length-qtdRepeat;
                repeat = unique > 0 ? Math.ceil(repeat/unique) : Math.ceil(repeat);
            }
        }
        Integer result = Math.negateExact(repeat.intValue());
        logResult(log,result);
        return result;
    }
}
