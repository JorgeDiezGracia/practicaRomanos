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

}
