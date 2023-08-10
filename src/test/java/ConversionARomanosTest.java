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


}
