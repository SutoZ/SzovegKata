package Code;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zolee on 2016. 09. 21..
 */
public class Szoveg {

    public static String accum(String s) {

        char[] szo = s.toCharArray();
        int hossz = szo.length;
        String res = "";
        char temp = ' ';
        res = logic(szo, hossz, res);

        return res;

        //testing(Szoveg.accum("abcd"), "A-Bb-Ccc-Dddd");
    }

    private static String logic(char[] szo, int hossz, String res) {
        char temp;
        for (int i = 0; i < hossz; i++) { //abc
            if(res != "") res += "-";
            temp = Character.toUpperCase(szo[i]);
            res = attachCharactersToResultString(szo, res, temp, i);

        }
        return res;
    }

    private static String attachCharactersToResultString
            (char[] szo, String res, char temp, int i) {
        for (int j = 0; j < i + 1; j++) {       //a-bb-ccc
            res += temp;
            temp = szo[i];

        }
        return res;
    }
}
