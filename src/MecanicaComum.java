import java.io.IOException;

public class MecanicaComum implements MecanicaJogo {

	private FabricaEmbaralhadores embaralha= new FabricaEmbaralhadores();
	private BancoDePalavras palavras = new BancoDePalavras();
	private Embaralhador emba;
	private int numTentativas;
	private String Original;
	private String Embaralhada;
	private int Acertos;
	private int Erros;
	
	public MecanicaComum() throws IOException
	{
		this.emba=embaralha.getRandEmbaralhador();
		Acertos=0;
		Erros=0;
		numTentativas=-1;
	}
	@Override
	public String getModo()
	{
		return "Jogo Comum";
	}
	
	@Override
	public boolean setGuess(String tentativa) {
		if(tentativa.equals(Original))
		{
			Acertos++;
			numTentativas=-1;
			return true;
		}
		numTentativas--;
		return false;
	}

	@Override
	public void setPalavra()  throws IOException {
		numTentativas=2;
		Original=palavras.getPalavra();
		Embaralhada=emba.Embaralha(Original);
	}

	@Override
	public String getPalavra() {
		return Embaralhada;
	}

	@Override
	public int getNumTentativas() {
		return numTentativas;
	}

	@Override
	public boolean acabouTentativas() {
		if(numTentativas<1)
		{
			Erros++;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean acabouJogo() {
		if(Acertos+Erros>palavras.getTam())
			return true;
		return false;
	}
	
	@Override
	public boolean ganhou() {
		if(Acertos>Erros)
			return true;
		return false;
	}

}
