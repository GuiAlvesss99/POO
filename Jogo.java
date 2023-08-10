package POO;

public class Jogo extends Atividade3 {
	
	private String Jogo;

	public Jogo(String console, String jogos, String acessorios, String mercadoriagamer, String funkopop, String jogo) {
		super(console, jogos, acessorios, mercadoriagamer, funkopop);
		Jogo = jogo;
	}

	public String getJogo() {
		return Jogo;
	}

	public void setJogo(String jogo) {
		Jogo = jogo;
	}
	
	public void imprimirInfo() {
		System.out.println("\nConsole:"+getConsole()+"\nJogos:"+getJogos()+"\nAcessorios:"+getAcessorios()+"\nObjetos da loja:"+getMercadoriagamer()+"\nFunkopop:"+getFunkopop()+
				"\nJogo novo:"+getJogo());
	}

}
