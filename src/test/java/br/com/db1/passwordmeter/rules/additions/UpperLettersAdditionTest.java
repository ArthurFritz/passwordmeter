package br.com.db1.passwordmeter.rules.additions;

import org.junit.Assert;
import org.junit.Test;

public class UpperLettersAdditionTest {

    UpperLettersAddition upperLettersAddition = new UpperLettersAddition();

    @Test
    public void testValueOneUpper(){
        Assert.assertSame(0, upperLettersAddition.calculate("A"));
    }


    @Test
    public void testValueAllUpper(){
        Assert.assertSame(0, upperLettersAddition.calculate("AAOSDIOASJDIJASIOOAJSDIJASDIJLKNVKSJDFGKIBSDFGUOIBDSFGOBNSKDJVCNSFASF"));
    }

    @Test
    public void testValueUpper(){
        Assert.assertSame(10, upperLettersAddition.calculate("aAOSDIOASJDIJASIOOAJSDIJASDIJLKNVKSJDFGKIcSDFGUOIBDSFGOBNSKDJVCNSFASFÇÇç"));
    }

    @Test
    public void testEspecialValueUpper(){
        Assert.assertSame(30, upperLettersAddition.calculate("~aaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAA"));
    }

}
