import java.util.Random;

public class FabricaEmbaralhadores {
	public Embaralhador getRandEmbaralhador()
	{
		Random random = new Random();
		int aux=random.nextInt();
		if (aux %2==0)
		{
			return  new EmbaUm();
		} 
		else
		{
			return new EmbaDois();
		}
			
	}
}
