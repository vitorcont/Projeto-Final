import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TesteBanco {

	@Test
	public void test() throws IOException {
		BancoDePalavras banco = new BancoDePalavras();
		assertEquals("Teste",banco.getPalavra());
		assertEquals("Teste",banco.getPalavra());
		
	}

}
