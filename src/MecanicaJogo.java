import java.io.IOException;

public interface MecanicaJogo {
	public boolean setGuess(String tentativa);
	public String getModo();
	public void setPalavra() throws IOException;
	public String getPalavra();
	public int getNumTentativas();
	public boolean acabouTentativas();
	public boolean acabouJogo();
	public boolean ganhou();
}
