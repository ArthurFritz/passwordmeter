package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class SequentialSymbolsDeductionTest {
    SequentialSymbolsDeduction sequentialSymbolsDeduction = new SequentialSymbolsDeduction();

    @Test
    public void testEmptyValue(){
        Assert.assertSame(0, sequentialSymbolsDeduction.calculate(")()()()()()()()()("));
    }
    
    @Test
    public void testNumbersValue(){
        Assert.assertSame(0, sequentialSymbolsDeduction.calculate("123456789012345678901234567890"));
    }
}
