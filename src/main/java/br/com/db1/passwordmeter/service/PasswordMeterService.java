package br.com.db1.passwordmeter.service;

import br.com.db1.passwordmeter.dto.PasswordResponse;

@FunctionalInterface
public interface PasswordMeterService {
    PasswordResponse checkScore(String password);
}
