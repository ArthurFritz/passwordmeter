package br.com.db1.passwordmeter.dto;

import br.com.db1.passwordmeter.enumeration.LevelScore;

import java.util.Objects;

public class PasswordResponse {

    private Integer score;
    private LevelScore levelScore;

    public Integer getScore() {
        return score;
    }

    public LevelScore getLevelScore() {
        return levelScore;
    }

    public String getDescription() {
        return levelScore.getDescription();
    }

    public PasswordResponse(LevelScore levelScore, Integer score) {
        this.levelScore = levelScore;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordResponse that = (PasswordResponse) o;
        return Objects.equals(score, that.score) &&
                levelScore == that.levelScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, levelScore);
    }
}
