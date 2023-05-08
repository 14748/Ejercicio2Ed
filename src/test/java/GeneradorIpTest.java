import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import ed.genradorIp.GeneradorIp;

class GeneradorIpTest {
	GeneradorIp ip1; 
	@BeforeEach
	void setUp() throws Exception {
		ip1 = new GeneradorIp();
	}

	@RepeatedTest(1000)
	void testGenerarNumero() {
		int result = ip1.generarNumero(0, 254);
		//System.out.println(result);
		assertTrue((result <= 254) && (result >= 0));
	}
	
	@Test
	void testGenerarIp() {
		String result = ip1.generarIp();
		String[] split = result.split("\\.");
		assertTrue((Integer.parseInt(split[0]) != 0) && (Integer.parseInt(split[3]) != 0));
	}
	
	

}
