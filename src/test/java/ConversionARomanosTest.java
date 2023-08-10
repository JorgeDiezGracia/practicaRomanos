import com.svalero.ConversionARomanos;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


public class ConversionARomanosTest {

    ConversionARomanos conversionARomanos;
    String numero;

    @Before
    public void init(){
        conversionARomanos = new ConversionARomanos();
        numero = "";
    }

    @Test
    public void testConversion(){
        numero = conversionARomanos.conversionNumero(1);
        Assert.assertEquals("I",numero);
    }

    @Test
    public void testConversion2(){
        numero = conversionARomanos.conversionNumero(2);
        Assert.assertEquals("II", numero);
    }

    @Test
    public void testConversion3(){
        numero = conversionARomanos.conversionNumero(3);
        Assert.assertEquals("III", numero);
    }
    @Test
    public void testConversion4(){
        numero = conversionARomanos.conversionNumero(4);
        Assert.assertEquals("IV", numero);
    }

    @Test
    public void testConversion5(){
        numero = conversionARomanos.conversionNumero(5);
        Assert.assertEquals("V", numero);
    }

    @Test
    public void testConversion6(){
        numero = conversionARomanos.conversionNumero(6);
        Assert.assertEquals("VI", "VI");
    }

    @Test
    public void testConversion7(){
        numero = conversionARomanos.conversionNumero(7);
        Assert.assertEquals("VII",numero);
    }
    @Test
    public void testConversion8(){
        numero = conversionARomanos.conversionNumero(8);
        Assert.assertEquals("VIII", numero);
    }

    @Test
    public void testConversion9(){
        numero = conversionARomanos.conversionNumero(9);
        Assert.assertEquals("IX", numero);
    }

    @Test
    public void testConversion10(){
        numero = conversionARomanos.conversionNumero(10);
        Assert.assertEquals("X",numero);
    }

    @Test
    public void testConversion14(){
        numero = conversionARomanos.conversionNumero(14);
        Assert.assertEquals("XIV", numero);
    }

    @Test
    public void testConversion16(){
        numero = conversionARomanos.conversionNumero(16);
        Assert.assertEquals("XVI",numero);
    }

    @Test
    public void testConversion24(){
        numero = conversionARomanos.conversionNumero(24);
        Assert.assertEquals("XXIV", numero);
    }

    @Test
    public void testConversion36(){
        numero = conversionARomanos.conversionNumero(36);
        Assert.assertEquals("XXXVI", numero);
    }

    @Test
    public void testConversion49(){
        numero = conversionARomanos.conversionNumero(49);
        Assert.assertEquals("XLIX", numero);
    }

    @Test
    public void testConversion50(){
        numero = conversionARomanos.conversionNumero(50);
        Assert.assertEquals("L", numero);
    }

    @Test
    public void testConversion77(){
        numero = conversionARomanos.conversionNumero(77);
        Assert.assertEquals("LXXVII", numero);
    }

    @Test
    public void testConversion100(){
        numero = conversionARomanos.conversionNumero(100);
        Assert.assertEquals("C", numero);
    }

    @Test
    public void testConversion101(){
        numero = conversionARomanos.conversionNumero(101);
        Assert.assertEquals("CI", numero);
    }

    @Test
    public void testConversion122(){
        numero = conversionARomanos.conversionNumero(122);
        Assert.assertEquals("CXXII", numero);
    }
}
