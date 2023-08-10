package POO;

public class MeiaEntrada extends Atividade5{

	private String Comprovante;

	public MeiaEntrada(String filme, String genero, String assento, String clasIndicativa, int tempoFilme,
			String comprovante) {
		super(filme, genero, assento, clasIndicativa, tempoFilme);
		Comprovante = comprovante;
	}

	public String getComprovante() {
		return Comprovante;
	}

	public void setComprovante(String comprovante) {
		Comprovante = comprovante;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do Filme:"+getFilme()+"\nGenero:"+getGenero()+"\nQual o assento?"+getAssento()+"\nClassificação indicativa:"+getClasIndicativa()+
				"\nTempo de filme:"+getTempoFilme()+"\nComprovante:"+getComprovante());
	}

}
