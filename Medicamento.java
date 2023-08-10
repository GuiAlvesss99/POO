package POO;

public class Medicamento extends Atividade4{
	
	

	private String Dosagem;

	public Medicamento(int codigo, String nomedoProduto, String categoriadoRemedio, String fabricante,
			String introduçãodeUso, String dosagem) {
		super(codigo, nomedoProduto, categoriadoRemedio, fabricante, introduçãodeUso);
		Dosagem = dosagem;
	}

	public String getDosagem() {
		return Dosagem;
	}

	public void setDosagem(String dosagem) {
		Dosagem = dosagem;
	}

	public void imprimirInfo() {
		System.out.println("\nCodigo:"+getCodigo()+"\nNome do produto:"+getNomedoProduto()+"\nCategoria do remedio:"+getCategoriadoRemedio()+"\nFabricante:"+getFabricante()+"\nComo usar:"
				+getIntroduçãodeUso()+"\nDosagem:"+getDosagem());
		
	}
}


