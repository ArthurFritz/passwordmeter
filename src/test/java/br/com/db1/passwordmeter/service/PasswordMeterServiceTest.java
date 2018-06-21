package br.com.db1.passwordmeter.service;

import br.com.db1.passwordmeter.dto.PasswordResponse;
import br.com.db1.passwordmeter.enumeration.LevelScore;
import org.junit.Assert;
import org.junit.Test;

public class PasswordMeterServiceTest {

    private PasswordMeterService passwordMeterService = new PasswordMeterServiceBean();

    @Test
    public void testValidCallService() {
        PasswordResponse response = passwordMeterService.checkScore("p@ssW00rdS!1!1");
        PasswordResponse expected = new PasswordResponse(LevelScore.VERY_STRONG, 100);
        Assert.assertEquals(expected, response);
    }

}
