import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	
	private ArrayList<String> listaPalavras = new ArrayList<String>();
	
	public BancoDePalavras() throws IOException
	{
		lerArquivo();
	}
	
	
	
	private void lerArquivo() throws IOException {	
		try
		{
			listaPalavras.clear();
			BufferedReader Leitura = new BufferedReader(new FileReader("palavras.txt"));
			String linha = Leitura.readLine();
			while (linha != null)
			{
				listaPalavras.add(linha.toLowerCase());
				linha = Leitura.readLine();
			}
			Leitura.close();

			} 
		catch(FileNotFoundException e) 
		{
				
			System.out.println("ERRO DE ARQUIVO");
		}
	}
	
	public String getPalavra()
	{
		Random gerador = new Random();
		int valor=40;
		valor=gerador.nextInt(listaPalavras.size());
			
		return listaPalavras.get(valor);
		
	}
	
	public int getTam()
	{
		return listaPalavras.size();
	}
	
}
