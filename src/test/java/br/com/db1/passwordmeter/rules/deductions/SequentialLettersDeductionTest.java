package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class SequentialLettersDeductionTest {
    SequentialLettersDeduction sequentialLettersDeduction = new SequentialLettersDeduction();

    @Test
    public void testValue(){
        Assert.assertSame(-51, sequentialLettersDeduction.calculate("abcdefghijklmnopqrs"));
    }

    @Test
    public void testValueSepareted(){
        Assert.assertSame(-39, sequentialLettersDeduction.calculate("abcde123fghijkl123123mnopqrs"));
    }

    @Test
    public void testValueSeparetedSymbol(){
        Assert.assertSame(-36, sequentialLettersDeduction.calculate("abcde@@@fghijk;.,;.,mnopqrs"));
    }

    @Test
    public void testValueReverted(){
        Assert.assertSame(-39, sequentialLettersDeduction.calculate("abcdedcba123fghijkl123123mnopqrs"));
    }
}
