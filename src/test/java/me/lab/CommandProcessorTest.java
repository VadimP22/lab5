package me.lab;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CommandProcessorTest 
{
    /**
     * Rigorous Test :-)
     */
    CommandProcessor cp = new CommandProcessor();
    String[] str = cp.parse("Hello bro my");

    @Test
    public void testParse()
    {
        String strIdeal[] = {"Hello", "bro", "my"};
        assertArrayEquals(str, strIdeal);
    }


    @Test
    public void testNoCommandException() {
        
        try {
            cp.execute("command1 azaza trololo");
        } catch (Exception e) {
            String text = e.getMessage();
            assertEquals(text, "Command <command1> not exists");
        }
    }
}
