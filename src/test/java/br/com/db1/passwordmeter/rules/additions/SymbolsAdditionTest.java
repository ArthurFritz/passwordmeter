package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class SymbolsAdditionTest {

    SymbolsAddition symbolsAddition = new SymbolsAddition();

    @Test
    public void testValueOne(){
        Assert.assertSame(6, symbolsAddition.calculate("@"));
    }

    @Test
    public void testValueAll(){
        Assert.assertSame(24, symbolsAddition.calculate("oasjdioasjd@ioajsdmasdonasmdosadngosdfçgboiandfiound.foiundfoiundfsduf,"));
    }

    @Test
    public void testValue(){
        Assert.assertEquals(Integer.valueOf(180), symbolsAddition.calculate("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"));
    }

}
