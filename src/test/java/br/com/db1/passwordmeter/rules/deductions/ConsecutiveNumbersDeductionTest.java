package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class ConsecutiveNumbersDeductionTest {
    ConsecutiveNumbersDeduction consecutiveNumbersDeduction = new ConsecutiveNumbersDeduction();

    @Test
    public void testValue(){
        Assert.assertSame(30, consecutiveNumbersDeduction.calculate("123456basdasd654321basdasd654321"));
    }

    @Test
    public void testValueNoSeparator(){
        Assert.assertSame(10, consecutiveNumbersDeduction.calculate("654321"));
    }

    @Test
    public void testValueNoConsecutive(){
        Assert.assertSame(0, consecutiveNumbersDeduction.calculate("1a2b3c4c5c6c7c8"));
    }

    @Test
    public void testValueManySeparator(){
        Assert.assertSame(6, consecutiveNumbersDeduction.calculate("ABC12DEF@CDF12DAS@CDF14DAS"));
    }

}
