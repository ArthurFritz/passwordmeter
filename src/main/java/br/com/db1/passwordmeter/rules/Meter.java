package br.com.db1.passwordmeter.rules;

import org.apache.commons.logging.Log;

public interface Meter {
    default void logResult(Log log, Integer result){
        log.info(" ..:: Rate : " + result);
    }
    Integer calculate(String password);
}
