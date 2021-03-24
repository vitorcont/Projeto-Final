import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhamento {
		@Test
		public void testeEmbaralhadorUm() {

				EmbaUm e = new EmbaUm();
				assertNotEquals(e.Embaralha("embaralhar"), "embaralhar");
		}
		
		@Test
		public void testeEmbaralhadorDois() {

			EmbaDois e = new EmbaDois();
			assertEquals(e.Embaralha("embaralhar"), "embaralhar");
		}

}
