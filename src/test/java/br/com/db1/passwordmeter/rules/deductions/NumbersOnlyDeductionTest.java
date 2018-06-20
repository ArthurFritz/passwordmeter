package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class NumbersOnlyDeductionTest {
    NumbersOnlyDeduction numbersOnlyDeduction = new NumbersOnlyDeduction();

    @Test
    public void testValueNumbersOne(){
        Assert.assertSame(1, numbersOnlyDeduction.calculate("1"));
    }

    @Test
    public void testValueNumbersBig(){
        Assert.assertSame(31, numbersOnlyDeduction.calculate("2094830928340928409802384092834"));
    }

    @Test
    public void testValueLettersAndNumber(){
        Assert.assertSame(0, numbersOnlyDeduction.calculate("982374982734Ahsasd"));
    }

    @Test
    public void testValueNumbersAndSymbol(){
        Assert.assertSame(0, numbersOnlyDeduction.calculate("123123123!@#!23123123"));
    }

    @Test
    public void testValueLettersAndSymbolAndNumber(){
        Assert.assertSame(0, numbersOnlyDeduction.calculate("asdasd@asdASDASD1231"));
    }

}
