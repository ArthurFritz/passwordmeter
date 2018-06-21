package br.com.db1.passwordmeter.service;

import br.com.db1.passwordmeter.dto.PasswordResponse;
import br.com.db1.passwordmeter.enumeration.LevelScore;
import br.com.db1.passwordmeter.rules.CalculateScore;
import org.springframework.stereotype.Service;

@Service
public class PasswordMeterServiceBean implements PasswordMeterService {

    @Override
    public PasswordResponse checkScore(String password) {
        CalculateScore calcScore = new CalculateScore();
        Integer score = calcScore.calcBonus(password);
        LevelScore levelScore = LevelScore.byScore(score);
        return new PasswordResponse(levelScore, score);
    }
}
