package br.com.db1.passwordmeter.controller;

import br.com.db1.passwordmeter.dto.PasswordRequest;
import br.com.db1.passwordmeter.dto.PasswordResponse;
import br.com.db1.passwordmeter.service.PasswordMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordMeterController {

    @Autowired
    private PasswordMeterService passwordMeterService;

    @RequestMapping(value = "/api/v1/password/check", method = RequestMethod.POST)
    public PasswordResponse checkPassword(@RequestBody PasswordRequest reqBody) {
        return passwordMeterService.checkScore(reqBody.getPassword());
    }
}
