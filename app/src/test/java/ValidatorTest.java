/**
 * Created by JIABIN on 2018/2/10.
 */

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    static Validator v;
    static String p="asfasfafasf";
    @BeforeClass
    public static void init() {
        v = new Validator(p);
    }
    @Test
    public void pwIscorrect(){
        assertEquals(2,v.validate());
    }

}