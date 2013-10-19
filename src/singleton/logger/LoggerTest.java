package singleton.logger;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoggerTest {
	@Test
	public void singleton() {
		assertSame("No es la misma referencia", Logger.getLogger(),
				Logger.getLogger());
	}
}
