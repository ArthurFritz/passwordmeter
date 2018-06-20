package br.com.db1.passwordmeter.rules.deductions;

import br.com.db1.passwordmeter.rules.Meter;

public class RepeatCharactersDeduction implements Meter {

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
        return Math.negateExact(repeat.intValue());
    }
}
