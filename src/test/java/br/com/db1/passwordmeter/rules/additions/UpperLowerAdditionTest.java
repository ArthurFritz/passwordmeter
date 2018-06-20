package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class UpperLowerAdditionTest {

    LowerLettersAddition lowerLettersAddition = new LowerLettersAddition();

    @Test
    public void testValueOne(){
        Assert.assertSame(0, lowerLettersAddition.calculate("a"));
    }


    @Test
    public void testValueAll(){
        Assert.assertSame(0, lowerLettersAddition.calculate("oasjdioasjdoioajsdmasdonasmdosadngosdfgboiandfioundfoiundfoiundfsduf"));
    }

    @Test
    public void testValue(){
        Assert.assertSame(12, lowerLettersAddition.calculate("aoiCdjaoFsidnoiasmdimiGcmcasiocdmasioHmdciasomdjasiojmcasiodjcamsidjcÇç"));
    }

    @Test
    public void testValueEspecial(){
        Assert.assertSame(50, lowerLettersAddition.calculate("~aaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

}
