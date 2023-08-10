package POO;

public class Console extends Atividade3{

	private String Console1;

	public Console(String console, String jogos, String acessorios, String mercadoriagamer, String funkopop,
			String console1) {
		super(console, jogos, acessorios, mercadoriagamer, funkopop);
		Console1 = console1;
	}

	public String getConsole1() {
		return Console1;
	}

	public void setConsole1(String console1) {
		Console1 = console1;
	}

	public void imprimirInfo() {
		System.out.println("\nConsole:"+getConsole()+"\nJogos:"+getJogos()+"\nAcessorios:"+getAcessorios()+"\nObjetos da loja:"+getMercadoriagamer()+"\nFunkopop:"+getFunkopop()+
				"\nConsole novo:"+getConsole1());
	}

	}

