package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class SequentialNumbersDeductionTest {
    SequentialNumbersDeduction sequentialNumbersDeduction = new SequentialNumbersDeduction();

    @Test
    public void testValue(){
        Assert.assertSame(-24, sequentialNumbersDeduction.calculate("12345678901234567890132456790"));
    }

    @Test
    public void testValueOnetoFour(){
        Assert.assertSame(-6, sequentialNumbersDeduction.calculate("1234"));
    }

    @Test
    public void testValueSepareted(){
        Assert.assertSame(-21, sequentialNumbersDeduction.calculate("abcde123fghijkl123123mnop123456789qrs654321"));
    }

    @Test
    public void testValueAllNumbers(){
        Assert.assertSame(-24, sequentialNumbersDeduction.calculate("0123456789"));
    }

    @Test
    public void testValueSequential(){
        Assert.assertSame(-3, sequentialNumbersDeduction.calculate("jose0kasd090i0234k"));
    }


}
