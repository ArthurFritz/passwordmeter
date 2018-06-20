package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveUpperDeductionTest {
    ConsecutiveUpperLettersDeduction consecutiveUpperLettersDeduction = new ConsecutiveUpperLettersDeduction();

    @Test
    public void testValue(){
        Assert.assertSame(-30, consecutiveUpperLettersDeduction.calculate("ABCDEFbasdasdCDFDASbasdasdCDFDAS"));
    }

    @Test
    public void testValueNoSeparator(){
        Assert.assertSame(-10, consecutiveUpperLettersDeduction.calculate("ABCDEF"));
    }

    @Test
    public void testValueNoConsecutive(){
        Assert.assertSame(0, consecutiveUpperLettersDeduction.calculate("AaBbCcCcCcCcCcC"));
    }

    @Test
    public void testValueManySeparator(){
        Assert.assertSame(-24, consecutiveUpperLettersDeduction.calculate("ABCasDEF@CDFcdDAS@CDFasDAS"));
    }

}
