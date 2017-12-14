import ip.IPSolution;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class IPSolutionTest {
    @Test
    public void testIpToLong(){ assertEquals(3232235777L, IPSolution.IpToInt("192.168.1.1")); }
    @Test
    public void testLongToIp(){ assertEquals("192.168.1.1", IPSolution.intToIp(3232235777L)); }
}
