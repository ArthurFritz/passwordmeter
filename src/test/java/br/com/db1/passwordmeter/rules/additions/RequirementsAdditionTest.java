package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class RequirementsAdditionTest {

    RequirementsAddition requirementsAddition = new RequirementsAddition();

    @Test
    public void testLength(){
        Assert.assertSame(0, requirementsAddition.calculate("12345678"));
    }

    @Test
    public void testNumber(){
        Assert.assertSame(0, requirementsAddition.calculate("4"));
    }

    @Test
    public void testLower(){
        Assert.assertSame(0, requirementsAddition.calculate("a"));
    }

    @Test
    public void testUpper(){
        Assert.assertSame(0, requirementsAddition.calculate("A"));
    }

    @Test
    public void testSymbol(){
        Assert.assertSame(0, requirementsAddition.calculate("@"));
    }

    @Test
    public void testValueAll(){
        Assert.assertSame(10, requirementsAddition.calculate("1c3Bb67@9"));
    }

}
