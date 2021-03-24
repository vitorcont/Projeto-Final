import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	public static Scanner input = new Scanner(System.in);
	public static int pontos;
	public static FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
	static MecanicaJogo Mec;
	
	
	public static void main(String[] args) throws IOException {
		 pontos=0;
		 menu();
		 
		 

	}
	
	public static void menu() throws IOException
	{
		int entrada = 0;
		while(entrada!=4)
		{
			System.out.println("1. Modo Comum");
			System.out.println("2. Modo Morte Subita");
			System.out.println("3. Pontuação");
			System.out.println("4. Sair");
			entrada = input.nextInt();
			
			if(entrada ==1 || entrada ==2)
			{
				Mec= fabrica.getRandEmbaralhador(entrada);
				jogo();
			
			}
				
			else if(entrada==3)
			{
				System.out.println("SEUS PONTOS ATUAIS: "+pontos);
			}
			else
				break;
		}
	}
	
	public static void jogo() throws IOException
	{
		String entrada;
		boolean Resposta;
		entrada = input.nextLine();
		do
		{
			if(Mec.getNumTentativas()==-1 || Mec.acabouTentativas())
			{
				Mec.setPalavra();
			}
			else
			{
				System.out.println("Modo: "+Mec.getModo());
				System.out.println("NUM DE TENTATIVAS: "+Mec.getNumTentativas());
				System.out.println("PALAVRA EMBARALHADA: "+Mec.getPalavra());
				System.out.println("DIGITE: ");
				entrada = input.nextLine();
				Resposta=Mec.setGuess(entrada);
				if(Resposta)
				{
					System.out.println("Você Acertou!");
				}
				else
					System.out.println("Você Errou!");
			}
		}while(!Mec.acabouJogo());
		if(Mec.ganhou())
			pontos++;
	}

}
