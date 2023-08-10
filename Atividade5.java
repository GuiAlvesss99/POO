package POO;

public class Atividade5 {

	
	private String Filme;
	private String Genero;
	private String Assento;
	private String ClasIndicativa;
	private int TempoFilme;
	
	public Atividade5(String filme, String genero, String assento, String clasIndicativa, int tempoFilme) {
		super();
		Filme = filme;
		Genero = genero;
		Assento = assento;
		ClasIndicativa = clasIndicativa;
		TempoFilme = tempoFilme;
	}

	public String getFilme() {
		return Filme;
	}

	public void setFilme(String filme) {
		Filme = filme;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getAssento() {
		return Assento;
	}

	public void setAssento(String assento) {
		Assento = assento;
	}

	public String getClasIndicativa() {
		return ClasIndicativa;
	}

	public void setClasIndicativa(String clasIndicativa) {
		ClasIndicativa = clasIndicativa;
	}

	public int getTempoFilme() {
		return TempoFilme;
	}

	public void setTempoFilme(int tempoFilme) {
		TempoFilme = tempoFilme;
	}
	
	public void imprimirInfo() {
		
	}
	
}
