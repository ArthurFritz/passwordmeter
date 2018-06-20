package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class MiddleNumbersSymbolsAdditionTest {

    MiddleNumbersSymbolsAddition middleNumbersSymbolsAddition = new MiddleNumbersSymbolsAddition();

    @Test
    public void testValueNotMidle(){
        Assert.assertSame(0, middleNumbersSymbolsAddition.calculate("@1"));
    }

    @Test
    public void testValueOne(){
        Assert.assertSame(0, middleNumbersSymbolsAddition.calculate("@"));
    }

    @Test
    public void testValueOnlyNumbersCaracter(){
        Assert.assertSame(4, middleNumbersSymbolsAddition.calculate("@12@"));
    }

    @Test
    public void testValue(){
        Assert.assertSame(12, middleNumbersSymbolsAddition.calculate("c@ç!#,.ç"));
    }

}
