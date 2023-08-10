package POO;

public class Vip extends Atividade5{

	private String Areavip;

	public Vip(String filme, String genero, String assento, String clasIndicativa, int tempoFilme, String areavip) {
		super(filme, genero, assento, clasIndicativa, tempoFilme);
		Areavip = areavip;
	}

	public String getAreavip() {
		return Areavip;
	}

	public void setAreavip(String areavip) {
		Areavip = areavip;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do Filme:"+getFilme()+"\nGenero:"+getGenero()+"\nQual o assento?"+getAssento()+"\nClassificação indicativa:"+getClasIndicativa()+
				"\nTempo de filme:"+getTempoFilme()+"\nCategoria de assento:"+getAreavip());
	}
}
