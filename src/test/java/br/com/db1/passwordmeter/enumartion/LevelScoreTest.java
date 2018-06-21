package br.com.db1.passwordmeter.enumartion;

import br.com.db1.passwordmeter.enumeration.LevelScore;
import org.junit.Assert;
import org.junit.Test;

public class LevelScoreTest {

    private LevelScore levelScore;

    @Test
    public void shouldValidateScoreGreaterThanOneHundred() {
        levelScore = LevelScore.byScore(120);
        Assert.assertEquals(LevelScore.VERY_STRONG, levelScore);
    }

    @Test
    public void shouldValidateScoreLessThanZero() {
        levelScore = LevelScore.byScore(-20);
        Assert.assertEquals(LevelScore.TOO_SHORT, levelScore);
    }

    @Test
    public void shouldValidateScoreVeryWeak() {
        levelScore = LevelScore.byScore(15);
        Assert.assertEquals(LevelScore.VERY_WEAK, levelScore);
    }

    @Test
    public void shouldValidateScoreVeryWeakWithMinLimit() {
        levelScore = LevelScore.byScore(0);
        Assert.assertEquals(LevelScore.TOO_SHORT, levelScore);
    }

    @Test
    public void shouldValidateScoreWeakWithMinLimit() {
        levelScore = LevelScore.byScore(20);
        Assert.assertEquals(LevelScore.WEAK, levelScore);
    }

    @Test
    public void shouldValidateScoreWeak() {
        levelScore = LevelScore.byScore(25);
        Assert.assertEquals(LevelScore.WEAK, levelScore);
    }

    @Test
    public void shouldValidateScoreGoodWithMinLimit() {
        levelScore = LevelScore.byScore(40);
        Assert.assertEquals(LevelScore.GOOD, levelScore);
    }

    @Test
    public void shouldValidateScoreGood() {
        levelScore = LevelScore.byScore(45);
        Assert.assertEquals(LevelScore.GOOD, levelScore);
    }

    @Test
    public void shouldValidateScoreStrongWithMinLimit() {
        levelScore = LevelScore.byScore(60);
        Assert.assertEquals(LevelScore.STRONG, levelScore);
    }

    @Test
    public void shouldValidateScoreStrong() {
        levelScore = LevelScore.byScore(70);
        Assert.assertEquals(LevelScore.STRONG, levelScore);
    }

    @Test
    public void shouldValidateScoreVeryStrongWithMinLimit() {
        levelScore = LevelScore.byScore(80);
        Assert.assertEquals(levelScore.VERY_STRONG, levelScore);
    }
}
