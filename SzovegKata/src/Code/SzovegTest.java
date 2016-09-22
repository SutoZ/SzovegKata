package Code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zolee on 2016. 09. 21..
 */
public class SzovegTest{
    private static void testing(String actual, String expected){
        assertEquals(actual, expected);
    }

    @Test
    public void Length(){
        assertEquals(Szoveg.accum("3"),"abc");
    }

    @Test
    public void test(){
        System.out.println("Fixed Tests accum");
        testing(Szoveg.accum("cwat"), "C-Ww-Aaa-Tttt");
    }
}