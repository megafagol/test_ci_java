package com.ingsoft.supermario;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import com.ingsoft.supermario.manager.Camera;
import com.ingsoft.supermario.model.hero.Mario;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testFuncAdd()
    {
        Camera newCamera = new Camera();
        Assert.assertEquals(8,newCamera.funcAdd(5,3));

    }
}
