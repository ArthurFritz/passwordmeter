package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveLowerDeductionTest {
    ConsecutiveLowerLettersDeduction consecutiveLowerLettersDeduction = new ConsecutiveLowerLettersDeduction();

    @Test
    public void testValue(){
        Assert.assertSame(-24, consecutiveLowerLettersDeduction.calculate("ABCDEFbasdasdCDFDASbasdasdCDFDAS"));
    }

    @Test
    public void testValueNoSeparator(){
        Assert.assertSame(-10, consecutiveLowerLettersDeduction.calculate("abcdef"));
    }

    @Test
    public void testValueNoConsecutive(){
        Assert.assertSame(0, consecutiveLowerLettersDeduction.calculate("AaBbCcCcCcCcCcC"));
    }

    @Test
    public void testValueManySeparator(){
        Assert.assertSame(-6, consecutiveLowerLettersDeduction.calculate("ABCasDEF@CDFcdDAS@CDFasDAS"));
    }

}
