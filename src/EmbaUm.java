import java.util.Random;

public class EmbaUm implements Embaralhador{
	public String Embaralha(String palavra)
	{
		Random random = new Random();
	
	    char a[] = palavra.toCharArray();

	    for( int i=0 ; i<a.length ; i++ )
	    {
	        int j = random.nextInt(a.length);
	        char aux = a[i]; 
	        a[i] = a[j];  
	        a[j] = aux;
	    }       

	    return new String(a);
		
	}
}
