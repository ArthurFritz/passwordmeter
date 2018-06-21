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
        Assert.assertSame(100, cs.calcBonus("jose0kasd090i0234k"));
    }

    @Test
    public void calcBonusNull(){
        CalculateScore cs = new CalculateScore();
        Assert.assertSame(0, cs.calcBonus(null));
    }
    
    @Test
    public void calcBonusRamdomPass4(){
        CalculateScore cs = new CalculateScore();
        Assert.assertSame(50, cs.calcBonus("1234567890123456789001234567890"));
    }
    
    @Test
    public void calBonusRamdomPass5() {
    	CalculateScore cs = new CalculateScore();
        Assert.assertSame(43, cs.calcBonus("1234 4321"));
    }
    
    @Test
    public void calBonusRamdomPass6() {
    	CalculateScore cs = new CalculateScore();
        Assert.assertSame(74, cs.calcBonus("1234a4321"));
    }
}
