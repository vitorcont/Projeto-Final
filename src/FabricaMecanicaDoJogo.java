import java.io.IOException;

public class FabricaMecanicaDoJogo {
	public MecanicaJogo getRandEmbaralhador(int i) throws IOException
	{
		if (i ==1)
		{
			return  new MecanicaComum();
		} 
		else
		{
			return new MecanicaSubita();
		}
			
	}
	

}
