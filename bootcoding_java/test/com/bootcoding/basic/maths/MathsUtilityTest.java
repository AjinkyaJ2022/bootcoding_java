package com.bootcoding.basic.maths;

import maths.MathsUtility;
import org.junit.Assert;
import org.junit.Test;

public class MathsUtilityTest {
    @Test
    public void testBSquare(){
        MathsUtility ms=new MathsUtility();
        int com=ms.bSquare(5,6);
        Assert.assertEquals(-11,com);
    }
    @Test
    public void testWholeSquare(){
        MathsUtility ms=new MathsUtility();
        int com=ms.wholeSquare(5,6);
        Assert.assertEquals(121,com);
    }
    @Test
    public void testPlusSquare(){
        MathsUtility ms=new MathsUtility();
        int com=ms.plusSquare(5,6);
        Assert.assertEquals(61,com);
    }
    @Test
    public void testAMinusBwholeSquare(){
        MathsUtility ms= new MathsUtility();
        int com=ms.AMinusBwholeSquare(5,6);
        Assert.assertEquals(1,com);
    }
    @Test
    public void testAPlusBPlusCwholeSquare(){
        MathsUtility ms=new MathsUtility();
        int com=ms.APlusBPlusCwholeSquare(5,6,9);
        Assert.assertEquals(400,com);

    }
    @Test
    public void testAMinusBMinusCwholeSquare(){
        MathsUtility ms=new MathsUtility();
        int ml=ms.AMinusBMinusCwholeSquare(5,6,9);
        Assert.assertEquals(100,ml);
    }
    @Test
    public void testAPlusBCube(){
        MathsUtility ms=new MathsUtility();
        int ml=ms.APlusBCube(5,6);
        Assert.assertEquals(1151,ml);
    }
    @Test
    public void testAMinusBCube(){
        MathsUtility ms=new MathsUtility();
        int ml=ms.AMinusBCube(5,6);
        Assert.assertEquals(179,ml);
    }
}
