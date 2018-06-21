package br.com.db1.passwordmeter.rules;

import org.junit.Assert;
import org.junit.Test;

public class CalculateScoreTest {

    @Test
    public void calcBonusEmpty(){
        CalculateScore cs = new CalculateScore();
        Assert.assertSame(0, cs.calcBonus(""));
    }

    @Test
    public void calcBonusRamdomPass1(){
        CalculateScore cs = new CalculateScore();
        Assert.assertSame(26, cs.calcBonus("dsaojfoiassdfmsaionhdfisadjf"));
    }

    @Test
    public void calcBonusRamdomPass2(){
        CalculateScore cs = new CalculateScore();
        Assert.assertSame(4, cs.calcBonus("1234"));
    }

    @Test
    public void calcBonusRamdomPass3(){
        CalculateScore cs = new CalculateScore();
        Assert.assertSame(113, cs.calcBonus("jose0kasd090i0234k"));
    }
}
