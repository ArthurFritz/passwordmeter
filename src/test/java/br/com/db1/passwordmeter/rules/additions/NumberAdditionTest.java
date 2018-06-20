package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class NumberAdditionTest {

    NumberAddition numberAddition = new NumberAddition();

    @Test
    public void testValueOnlyNumbers(){
        Assert.assertSame(0, numberAddition.calculate("32165156132146165132"));
    }


    @Test
    public void testValueAll(){
        Assert.assertSame(60, numberAddition.calculate("a123a654as321a9"));
    }

}
