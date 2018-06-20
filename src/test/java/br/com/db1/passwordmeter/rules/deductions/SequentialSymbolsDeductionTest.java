package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class SequentialSymbolsDeductionTest {
    SequentialSymbolsDeduction sequentialSymbolsDeduction = new SequentialSymbolsDeduction();

    @Test
    public void testEmptyValue(){
        Assert.assertSame(0, sequentialSymbolsDeduction.calculate(")()()()()()()()()("));
    }
}
