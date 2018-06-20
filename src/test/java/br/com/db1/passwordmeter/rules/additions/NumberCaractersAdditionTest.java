package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class NumberCaractersAdditionTest {

    NumberCaractersAddition numberCaractersAddition = new NumberCaractersAddition();

    @Test
    public void testValueOne(){
        Assert.assertSame(4, numberCaractersAddition.calculate("a"));
    }


    @Test
    public void testValueAll(){
        Assert.assertSame(44, numberCaractersAddition.calculate("9012k309Cad"));
    }

}
