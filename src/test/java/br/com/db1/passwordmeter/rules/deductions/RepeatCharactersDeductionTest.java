package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class RepeatCharactersDeductionTest {
    RepeatCharactersDeduction repeatCharactersDeduction = new RepeatCharactersDeduction();

    @Test
    public void testManyRepeatA(){
        Assert.assertSame(-124, repeatCharactersDeduction.calculate("aaaaaaaaaaaa"));
    }

    @Test
    public void testManyRepeatUpperLower(){
        Assert.assertSame(-47, repeatCharactersDeduction.calculate("aAaAaAaAaAaAa"));
    }

    @Test
    public void testManyRepeatRamdom(){
        Assert.assertSame(-15, repeatCharactersDeduction.calculate("aa11jj88asdhiuahduisd777123asjdiojb87iauhduih99"));
    }

    @Test
    public void testManyRepeatSpaceRamdom(){
        Assert.assertSame(-16, repeatCharactersDeduction.calculate("aa11jj88asdhiuah     asdduisd777123asjdiojb87iauhduih99"));
    }


}
