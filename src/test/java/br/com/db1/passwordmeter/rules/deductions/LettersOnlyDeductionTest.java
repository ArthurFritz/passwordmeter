package br.com.db1.passwordmeter.rules.deductions;

import org.junit.Assert;
import org.junit.Test;

public class LettersOnlyDeductionTest {
    LettersOnlyDeduction lettersOnlyDeduction = new LettersOnlyDeduction();

    @Test
    public void testValueLettersOne(){
        Assert.assertSame(1, lettersOnlyDeduction.calculate("a"));
    }

    @Test
    public void testValueLettersBig(){
        Assert.assertSame(58, lettersOnlyDeduction.calculate("IUAIubniOABSIOuasiuANHSIUaonsiuOANSIuansiAUOBSBSVUVAvsyuov"));
    }

    @Test
    public void testValueLettersAndNumber(){
        Assert.assertSame(0, lettersOnlyDeduction.calculate("asdasdASDASDasd1"));
    }

    @Test
    public void testValueLettersAndSymbol(){
        Assert.assertSame(0, lettersOnlyDeduction.calculate("asdasd@asdASDASD"));
    }

    @Test
    public void testValueLettersAndSymbolAndNumber(){
        Assert.assertSame(0, lettersOnlyDeduction.calculate("asdasd@asdASDASD1231"));
    }

}
